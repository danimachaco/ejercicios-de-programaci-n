const form = document.getElementById("form-producto");

form.addEventListener("submit", function (event) {
    event.preventDefault(); // evita que recargue la página

    const num_ref = document.getElementById("num_ref").value;
    const nombre = document.getElementById("nombre").value;
    const categoria = document.getElementById("categoria").value;
    const precio = document.getElementById("precio").value;
    const stock = document.getElementById("stock").value;

    const precioReal = parseFloat(precio);

    const nuevoProducto = {
        num_ref: num_ref,
        nombre: nombre,
        categoria: categoria,
        precio: precioReal,
        stock: stock
    };

    fetch("http://localhost:8080/productos", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(nuevoProducto)
    }).then(() => {
        // volver al listado
        window.location.href = "productos.html";
    });
});