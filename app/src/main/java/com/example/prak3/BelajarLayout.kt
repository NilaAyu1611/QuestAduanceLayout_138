package com.example.prak3

import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier.fillMaxSize( )
    ){
        HeaderSection2()                    // Disini tinggal kita panggil paramter tersebut
        DataMhs(
            param = "Nama",
            argu = "Nila Ayu Citra Wulan"
        )
        DataMhs(
            param = "Nim",
            argu = "20220140138"
        )

        DataMhs(
            param = "Prodi",
            argu = "Teknologi Informasi"
        )
        DataMhs(
            param = "Fakultas",
            argu = "Teknik"
        )
        DataMhs(
            param = "Universitas",
            argu = "Universitas Muhammadiyah Yogyakarata"
        )
        DataMhs(
            param = "Alamat",
            argu = "Madiun, Jawa Timur"
        )
        DataMhs(
            param = "Email",
            argu = "nila.ayu.ft22@mail.umy.ac.id"
        )




    }
}

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)

    )

    {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)       // diberikan jaraknya
        ){
            Box(contentAlignment = Alignment.BottomEnd              // Agar bisa terletak dibawah disertai dengan backgroundnya

            ){
                Image(
                    painter = painterResource(id = R.drawable.ti),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp).
                    background(Color.Blue)

                )
            }
            Column(modifier = Modifier.padding(14.dp)) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }

        }


    }
}

@Composable
fun DataMhs(
    param : String, argu:String             // Agar lebih mudah dideklarasikan maka nani tinggal dipanggil
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.9f))
            Text(text = " :",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))       // Mmberikan ruang
        }
    }
}
