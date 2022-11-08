async function loadResidentes() {
    const options = { method: 'GET' };
    const res = await fetch('http://localhost:8080/residentes/all', options);
    const data = await res.json();
    //console.log(data);
    let tbody = "";
    for (let index = 0; index < data.length; index++) {
        const element = data[index];
        tbody += `<tr>
              <td>${element.idResidente}</td>
              <td>${element.primerNombre}</td>
              <td>${element.primerApellido}</td>
              <td>${element.tipoDoc}</td>
              <td>${element.numeroDoc}</td>
              <td>${element.correoElectronico}</td>
              <td>${element.idApto}</td>
              <td><button id="btn-delete" class="btn btn-danger" onclick="eliminarResidente(${element.idResidente})">Eliminar</button></td>
              <td><button id="btn-edit" class="btn btn-success" onclick="editarResidente(${element.idResidente})">Editar</button></td>
              </tr>`
    } document.getElementById("contenido").innerHTML = tbody;
}


function eliminarResidente(id) {
    if (confirm("Seguro de eliminar?")) {
        const options = { method: 'DELETE' };
        fetch('http://localhost:8080/residentes/' + id, options)
            .then(response => {
                loadResidentes();
            })
            .catch(err => console.error(err));
    }
}

function guardarResidente(){
    let primerNombre=document.getElementById("nombre").value;
    let correoElectronico=document.getElementById("email").value;
    
    const options = {
        method: 'POST',
        headers:{"Content-type":"application/json"},
        body: JSON.stringify({primerNombre,correoElectronico})
      };
      
      fetch('http://localhost:8080/residentes', options)
        .then(response => response.json())
        .then(response => {console.log(response);loadResidentes})
        .catch(err => console.error(err));
}

loadResidentes();  
