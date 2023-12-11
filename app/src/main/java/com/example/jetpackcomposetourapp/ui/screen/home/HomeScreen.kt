package com.example.jetpackcomposetourapp.ui.screen.home

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpackcomposetourapp.R
import com.example.jetpackcomposetourapp.TourListApp
import com.example.jetpackcomposetourapp.di.Injection
import com.example.jetpackcomposetourapp.model.TypeTour
import com.example.jetpackcomposetourapp.ui.common.UiState
import com.example.jetpackcomposetourapp.ui.component.TourItem
import com.example.jetpackcomposetourapp.ui.theme.JetpackComposeTheme
import com.example.jetpackcomposetourapp.ui.theme.ViewModelFactory

@Composable
fun HomeScreen (
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
       factory = ViewModelFactory(Injection.provideRepository())
),
    navigateToDetail: (Long) -> Unit,
){
    val query by viewModel.query

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top

        ) {
        SearchBar(
            query = query,
            onQueryChange = viewModel::search,
            modifier = Modifier.fillMaxWidth()
        )

        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAllTour()
                }

                is UiState.Success -> {
                    HomeContent(
                        tourList = uiState.data,
                        modifier = modifier,
                        navigateToDetail = navigateToDetail,
                    )
                }

                is UiState.Error -> {
                    val error = uiState.errorMessage
                    Log.e("Home", "Error: $error")
                }
            }
        }
    }
}

@Composable
fun HomeContent(
    tourList: List<TypeTour>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit
){
    LazyVerticalGrid(
        columns = GridCells.Adaptive(120.dp) ,
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ){
        items(tourList){data->
            TourItem(
                picture =data.tour.picture ,
                title =data.tour.title ,
                origin =data.tour.area,
                modifier = Modifier.clickable {
                    navigateToDetail(data.tour.id)
                }
            )

        }
    }

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    query:String,
    onQueryChange: (String)-> Unit,
    modifier: Modifier =Modifier
){
    androidx.compose.material3.SearchBar(
        query = query,
        onQueryChange = onQueryChange,
        onSearch = {},
        active = false,
        onActiveChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        placeholder = {
            Text(stringResource(R.string.search_menu))
        },
        shape = MaterialTheme.shapes.large,
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .heightIn(min = 48.dp)

    ) {

    }

}

@Preview(showBackground = true)
@Composable
fun TourListPreview(){
    JetpackComposeTheme {
        TourListApp(

        )
    }
}
