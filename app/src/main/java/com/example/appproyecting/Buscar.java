package com.example.appproyecting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Buscar extends AppCompatActivity {
    RecyclerView Mostrar;
    EditText Ingre_Datos;
    List<ProductosPlanilla> Datos;
    Button Escoger;
    TextView Ir_coment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        Mostrar = findViewById(R.id.Ver_Produc);
        Ingre_Datos = findViewById(R.id.Prod_Ingre);
        Ir_coment = findViewById(R.id.Repor_Product);
        Escoger = findViewById(R.id.Buscar);
        Escoger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Seleccionar();
            }
        });
    }
    public void Seleccionar(){
        String op;
        op = Ingre_Datos.getText().toString();
        if(op.equals("Teléfonos") || op.equals("teléfonos")){
            Datos = new ArrayList<>();
            Datos.add(new ProductosPlanilla(R.drawable.galaxya23,
                    "Samsung Galaxy S20.",
                    "Precio: $ 270.00",
                    "Cantidad de Producto: 30.",
                    " Validación: Recibo Electrónico.",
                    " Pantalla: 6.1, 1080 x 2340 pixeles. \n Procesador: Snapdragon 8 Gen for Galaxy \n 3.36Ghz. \n RAM: 8GB. \n Almacenamiento: 128GB/256GB/512GB \n Cámara: Triple, 50MP+12Mp+10MP. \n Batería: 3900 mAh.")
            );
            Datos.add(new ProductosPlanilla(R.drawable.y9,
                    " Huawei Y9 2019.",
                    "Precio: $ 150.00.",
                    "Cantidad de Producto: 10.",
                    "Validación: Recibo Electrónico. ",
                    "Sistema Operativo: EMUI 8.2. \n Pantalla: 6.5 pulgadas 19.5: 9 FHD.\n Memoria: 3GB + 64GB.\n Batería: 4,000 mAh. \n Cámara: Frontal: Apertura 16M + 2 M, f/2.0 + f/2.4. \n Cámara trasera: apertura 13 M + 2 M, f/1.8 + f/2.4")
            );
            Datos.add(new ProductosPlanilla(R.drawable.xiom,
                    "Xiaomi Redmi Note 9.",
                    "Precio: $270.00",
                    "Cantidad del Producto: 20.",
                    " Validación: Recibo Electrónico.",
                    "Pantalla: 6,53\" IPS FullHD, \n Procesador: MediaTek Helio G85 Octa-core a 2.0GHz. \n Memoria RAM: 3/4GB. \n Almacenamiento: 64/128 GB + MicroSD(Hasta 512).\n Batería: 5.020 mAh.")
            );
            Datos.add(new ProductosPlanilla(R.drawable.ip,
                    "Iphone 14 Pro Max.",
                    "Precio: $ 1,250.",
                    "Cantidad del producto: 30.",
                    "Validación: Recibo Electrónico.",
                    "Pantalla: 6,7 pulgadas panel LTPO Super Retina XDR OLED con tasa de refresco de 120 Hz.\n Sistema Operativo: IOS16.\n Procesador: Apple A16 Blonic.\n Memoria interna: 256GB/512GB/1TB.\n Batería: 4.323 mAh.")
            );

        } else if (op.equals("Herramientas") || op.equals("herramientas")) {
            Datos = new ArrayList<>();
            Datos.add(new ProductosPlanilla(R.drawable.herra,
                    "Portaforio De Herramientas",
                    "Precio $: 45.00",
                    "Cantidad De Producto: 30",
                    " Validación: Recibo Electrónico",
                    "Desarmadores y llaves Allen. \n Para línea De Corriente Electrónica. \n Pinzas multiusos.")
            );
            Datos.add(new ProductosPlanilla(R.drawable.pon,
                    "Pinza Ponchadora de plug RJ45.",
                    "Precio: $ 11.50.",
                    "Cantidad de Producto: 40.",
                    " Validación: Recibo Electrónico.",
                    "Arma cables Ethernet con gran calidad.\n Incorpora navajas de corte.\n Con resorte que mantiene la apertura.\n Para cables redondos y planos. Tienes seguro de apertura. \n Mango antiderrapante.")
            );
        } else if (op.equals("Muebles") || op.equals("muebles")) {
            Datos = new ArrayList<>();
            Datos.add(new ProductosPlanilla(R.drawable.meb,
                    "Mueble De Hogar",
                    "Precio: $750.00",
                    "Cantidad De Producto: 50",
                    " Validaión: Recibo Electrónico",
                    " Comodo Para La Sala, Mejor Espacio Para Concentrarte, \n Podrás Estar Tranquilamente Observando la TV")
            );
            Datos.add(new ProductosPlanilla(R.drawable.jueg,
                    "Commodity Juego de Comedor",
                    "Precio: $ 125.00",
                    "Cantidad de Producto: 15.",
                    " Validación: Recibo Electrónico.",
                    "Juego de Comedor (4 personas) GI2178_ROSA marca Commodity, \n mesa rectangular de madera, sillas de madera.\n Dimensiones Mesa: Alto: 74 cms\n" +
                            "Largo: 70 cms\n" +
                            "Ancho: 110 cms. Sillas: \n Alto: 84 cms. \n Largo: 43 cms.")
            );
        }else if(op.equals("Relojes") || op.equals("relojes")){
            Datos = new ArrayList<>();
            Datos.add(new ProductosPlanilla(R.drawable.reloj,
                    "SMARTWATCH HUAWEI GT",
                    "Precio: $ 150.00",
                    "Cantidad De Producto: 10",
                    " Validación: Recibo Electrónico",
                    " Es cómodo para hacer ejercicio, a la vez elegante.\n Pantalla: 1.29 pulgadas. \n Sistema Operativo: Propiertario. \n Coexiones Inalámbricas: BlueTooth v(5.1).\n Dimensiones: 53 x 46.8 x 10.8 mm.")
            );
            Datos.add(new ProductosPlanilla(R.drawable.clas,
                    "RELOJ CASIO HOMBRE MTP-1095Q-9B1.",
                    "Precio: $ 100.00",
                    "Cantidad de Producto: 20",
                    " Validación: Recibo Electrónico.",
                    "Cristal Mineral Material de la caja.\n Baño de iones Correa de cuero \n Funciones clásicas de reloj Analógica: 3 agujas (hora, minuto, segundo) \n Precisión: ±20 segundos por mes. \n Duración aprox. de la pila: 3 años en el modelo SR626SW.")
            );
        } else if (op.equals("Laptops") || op.equals("laptop")) {
            Datos = new ArrayList<>();
            Datos.add(new ProductosPlanilla(R.drawable.pc,
                    "Dell Latitud 3420 i7-1165",
                    "Precio: $1,000",
                    "Cantidad de Producto: 30",
                    "Validación: Recibo Electrónico",
                    "Procesador: i765 de 2.8 GHc.")
            );
            Datos.add(new ProductosPlanilla(R.drawable.hp,
                    "HP 15-DW1514LA (CELERON, 4GB,1TB)",
                    "Precio: $ 400.00",
                    "Cantidad de Producto: 50.",
                    " Validación: Recibo Electrónico.",
                    "Pantalla:HD (1366 x 768) de 15,6\" (39,6 cm).\n Memoria RAM: 4 GB de RAM DDR4-2400 MHz (1 x 4 GB).\n Almacenamiento: Disco duro SATA de 1 TB y 5400 RPM.\n Sistema Operativo: Windows 11 Home.")
            );
        }
        Adptador_Productos nuevo = new Adptador_Productos(Datos, this);
        Mostrar.setHasFixedSize(true);
        Mostrar.setLayoutManager(new LinearLayoutManager(this));
        Mostrar.setAdapter(nuevo);
    }
}