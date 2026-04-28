fetch("http://localhost:8080/productos")
    .then(response => response.json())
    .then(productos => {
        const tabla = document.getElementById("tabla-productos");

        productos.forEach(p => {
            const fila = document.createElement("tr");

            const tdNumRef = document.createElement("td");
            tdNumRef.textContent = p.num_ref;

            const tdNombre = document.createElement("td");
            tdNombre.textContent = p.nombre;

            const tdCategoria = document.createElement("td");
            tdCategoria.textContent = p.categoria;

            const tdPrecio = document.createElement("td");
            tdPrecio.textContent = p.precio;

            const tdStock = document.createElement("td");
            tdStock.textContent = p.stock;

            const btnEliminar = document.createElement("button");
            btnEliminar.textContent = "X";
            btnEliminar.classList.add("btn-eliminar");
            btnEliminar.onclick = () => eliminarProducto(p.num_ref);


            fila.appendChild(tdNumRef);
            fila.appendChild(tdNombre);
            fila.appendChild(tdCategoria);
            fila.appendChild(tdPrecio);
            fila.appendChild(tdStock);

            fila.appendChild(btnEliminar);

            tabla.appendChild(fila);


        });
        function eliminarProducto(numRef){
            fetch(`http://localhost:8080/productos/${numRef}`, {
                method: "DELETE"
            })
                .then(r => {
                    if (r.ok) {
                        alert("Producto eliminado");
                        location.reload();
                    } else {
                        alert("Error al eliminar");
                    }
                });
        }
    });