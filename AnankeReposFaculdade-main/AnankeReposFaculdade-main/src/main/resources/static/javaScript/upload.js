const dropArea = document.querySelector(".drop_box"),
  button = dropArea.querySelector("button"),
  dragText = dropArea.querySelector("header"),
  input = dropArea.querySelector("input");

let file;
var filename;

button.onclick = () => {
  input.click();
};

input.addEventListener("change", function (e) {

  var fileName = e.target.files[0].name;
  let filedata = `
    <form method="post" action="/documentos/salvar">
    <div class="form">
    <h4>${fileName}</h4>
    <input type="file" accept=".doc,.docx,.pdf" id="fileID" style="display:none;" name="arquivo">
    <input type="text" name="nome" placeholder="Insira o titulo do projeto">
    <button class="btn">salvar</button>
    </div>
    </form>`;
  dropArea.innerHTML = filedata;
});

function onDragStart(event) {
  event
    .dataTransfer
    .setData('text/plain', event.target.id);

  event
    .currentTarget
    .style
    .backgroundColor = 'yellow';
}
function onDragOver(event) {
  event.preventDefault();
}
  