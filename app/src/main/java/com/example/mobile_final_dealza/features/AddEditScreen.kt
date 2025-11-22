package com.example.mobile_final_dealza.features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobile_final_dealza.model.PizzaBrand
import com.example.mobile_final_dealza.ui.theme.MobilefinaldealzaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddEditScreen(
){
    val spacer = 12.dp
    var expanded by remember { mutableStateOf(false) }
    
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            /* Form Title */
            Text(
                text = "Add/Edit New Dealza",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(Modifier.height(spacer))

            /* Deal title input field */
            Text(
                text = "Deal Title",
                style = MaterialTheme.typography.bodyLarge
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {},
                placeholder = { Text("Enter Title") }
            )
            Spacer(Modifier.height(spacer))

            /* Deal description input field */
            Text(
                text = "Deal Description",
                style = MaterialTheme.typography.bodyLarge
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {},
                placeholder = { Text("Enter Description") }
            )
            Spacer(Modifier.height(spacer))

            /* Pizza brand dropdown menu */
            Text(
                text = "Pizza Brand",
                style = MaterialTheme.typography.bodyLarge
            )
            ExposedDropdownMenuBox(
                modifier = Modifier.fillMaxWidth(),
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                TextField(
                    value = "Select the Pizza Brand",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expanded
                        )
                    },
                    modifier = Modifier.menuAnchor(type = MenuAnchorType.PrimaryEditable, enabled =true).fillMaxWidth(),
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    PizzaBrand.entries.forEach { brand ->
                        DropdownMenuItem(
                            text = { Text(brand.name) },
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddEditScreenPreview(){
    MobilefinaldealzaTheme {
        AddEditScreen()
    }
}