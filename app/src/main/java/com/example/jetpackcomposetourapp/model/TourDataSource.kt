package com.example.jetpackcomposetourapp.model

import android.provider.ContactsContract.Data
import com.example.jetpackcomposetourapp.R

object TourDataSource {
    val dummyTour = listOf(
        DataTour(1, R.drawable.place1, "RAJA AMPAT", "Papua Barat", "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian kepala Burung(Vogelkoop) Pulau Papua. Gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat. Wilayah laut dan darat Raja Ampat yang memiliki luas 4,6 juta hektar ini menjadi rumah bagi 540 jenis karang, 1.511 spesies ikan dan ribuan laut lainnya. Oleh karena itu, dengan berbagai keunggulan ini tidak heran apabila Raja Ampat saat ini dianggap sebagaisurga bawah laut tercantik di seluruh dunia."),
        DataTour(2, R.drawable.place2,"LABUAN BAJO","Nusa Tenggara Barat", "Labuan Bajo merupakan sebuah surga tersembunyi yang ada di Indonesia bagian timur. Desa ini terletak di Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur yang berbatasan langsung dengan Nusa Tenggara Barat dan dipisahkan oleh Selat Sape."),
        DataTour(3, R.drawable.place3,"BINTAN", "Kepulauan Riau", "Bintan adalah pulau terbesar di Kepulauan Riau, yang terdiri dari hampir 3.000 pulau besar dan kecil, terbentang di seberang Singapura dan Johor Bahru, Malaysia. Pulau ini melebar dari Malaka ke Laut Natuna Utara."),
        DataTour(4, R.drawable.place4,"DANAU TOBA", "Sumatera Utara", "Danau Toba adalah sebuah danau vulkanik dengan ukuran panjang 100 kilometer dan lebar 30 kilometer yang terletak di Provinsi Sumatera Utara, Indonesia. Danau ini merupakan danau terbesar di Indonesia dan Asia Tenggara. Di tengah danau ini terdapat sebuah pulau vulkanik bernama Pulau Samosir."),
        DataTour(5, R.drawable.place5,"LOMBOK","Nusa Tenggara Barat", "Pulau Lombok merupakan pulau terbesar di gugusan kepulauan di Provinsi NTB. Pulau Lombok salah satu pulau yang memiliki ragam wisata terkhusus dengan kekayaan alamnya yang mengagumkan, mulai dari wisata ekstrim seperti wisata Gunung Rinjani, hingga wisata halal yang terkenal religi seperti wisata masjid Islamic Center."),
        DataTour(6, R.drawable.place6, "GUNUNG BROMO", "Kabupaten Malang","Gunung Bromo atau dalam bahasa Tengger dieja \"Brama\", juga disebut Kaldera Tengger, adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru."),
        DataTour(7, R.drawable.place7,"GUNUNG RINJANI", "Pulau Lombok, Nusa Tenggara Barat","Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 mdpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya.[2] Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur."),
        DataTour(8, R.drawable.place8, "TAMAN LAUT BUNAKEN", "Sulawesi Utara", "Taman Nasional Bunaken adalah taman laut yang terletak di Sulawesi Utara, Indonesia. Taman ini terletak di Segitiga Terumbu Karang yang menjadi habitat bagi 390 spesies terumbu karang[2] dan juga berbagai spesies ikan, moluska, reptil, dan mamalia laut. Taman Nasional Bunaken merupakan perwakilan ekosistem laut Indonesia, meliputi padang rumput laut, terumbu karang, dan ekosistem pantai."),
        DataTour(9, R.drawable.place9,"DANAU SENTANI","Papua","Danau Sentani adalah danau yang terletak di Papua Indonesia. Danau Sentani berada di bawah lereng Pegunungan Cagar Alam Cyclops yang memiliki luas sekitar 245.000 hektar. Danau ini terbentang antara Kota Jayapura dan Kabupaten Jayapura, Papua. Danau Sentani yang memiliki luas sekitar 9.360 hektar dan berada pada ketinggian 75 mdpl. Danau Sentani merupakan danau terluas di Papua."),
        DataTour(10,R.drawable.place10,"TANA TORAJA", "Sulawesi Selatan","Tana Toraja adalah salah satu kabupaten yang berada di provinsi Sulawesi Selatan, Indonesia. Ibu kota dari kabupaten ini ada di kecamatan Makale. Tana Toraja memiliki luas wilayah 2.054,30 km² dan pada tahun 2022 memiliki penduduk sebanyak 291.046 jiwa dengan kepadatan 142 jiwa/km². Suku Toraja yang mendiami daerah pegunungan dan mempertahankan gaya hidup yang khas dan masih menunjukkan gaya hidup Austronesia yang asli dan mirip dengan budaya suku Batak Toba dan Nias yang ada di provinsi Sumatera Utara. Daerah ini merupakan salah satu objek wisata unggulan di provinsi Sulawesi Selatan"),
        DataTour(11,R.drawable.place11, "CANDI BOROBUDUR", "Magelang, Jawa Tengah", "Candhi Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi dengan banyak stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia,[1][2] sekaligus salah satu monumen Buddha terbesar di dunia."),
        DataTour(12,R.drawable.place12, "TAMAN NASIONAL WAY KAMBAS", "Lampung", "Taman Nasional Way Kambas (TNWK) adalah taman nasional perlindungan gajah yang terletak di daerah Lampung tepatnya di Kecamatan Labuhan Ratu, Lampung Timur, Indonesia. Selain di Way Kambas, sekolah gajah (Pusat Latihan Gajah) juga bisa ditemui di Minas, Riau. Gajah Sumatra (Elephas maximus sumatranus) yang hidup di kawasan ini semakin berkurang jumlahnya."),
        DataTour(13,R.drawable.place13,"GUA GONG", "Pacitan, Jawa Timur", "Goa Gong terletak di Jl. Salam, Salam, Bomo, Punung, Kabupaten Pacitan, Jawa Timur yang juga terkenal dengan julukan kota 1001 gua, dan satu yang terkenal disini adalah tempat wisata Goa Gong Pacitan. Pacitan merupakan wilayah di Jawa Timur yang dikelilingi oleh pegunungan kapur, yang menjadikan tanah di daerah ini kering dan tidak subur. Tanah di permukaan Pacitan memang gersang dan memiliki sedikit unsur hara, namun anugerah Yang Maha Kuasa ternyata bukan terletak di atas permukaan, namun di bawah permukaan tanahnya. Menurut cerita dari warga sekitar, Goa Gong ditemukan sekitar tahun 1930an. Akibat musim kemarau berkepanjangan, yang dimana Pacitan mengalami kekeringan dan sangat sulit untuk memperoleh air."),
        DataTour(14,R.drawable.place14, "GILI TRAWANGAN", "Nusa Tenggara Barat", "Gili Trawangan terletak di Desa Gili Indah, Kecamatan Pemenang, Kabupaten Lombok Utara (KLU) Nusa Tenggara Barat. Trawangan termasuk salah satu kawasan strategis provinsi (KSP), bersamaan dengan Gili Meno dan Gili Air, atau yang disebut juga Pesona Gili Tramena (Trawangan, Meno dan Air). Gili Trawangan adalah yang terbesar dari ketiga pulau kecil atau gili yang terletak di sebelah barat laut Lombok. Trawangan juga satu-satunya gili yang ketinggiannya di atas permukaan laut cukup signifikan. Dengan panjang 3 km dan lebar 2 km, Gili Trawangan berpopulasi sekitar 2.089 jiwa dengan rasio laki-laki dan perempuan adalah 1,08.")

    )
}