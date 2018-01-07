#language:es
@tag
Característica: Publicación en el Blog
  Para incrementar mis seguidores
  Como Autor
  Quiero poder publicar contenido en el blog

@tag1
Escenario: El autor publica el contenido en el blog
    Dado que estoy autenticado como Autor
    Y me encuentro en la página  de agregar contenido
    Cuando ingrese el título del mensaje
    Y ingrese el contenido
    Y seleccione Publicar
    Entonces debe mostrarse "Su contenido fue publicado"
    
@tag2
Escenario: El autor falla al publicar contenido en el blog
Dado que estoy autenticado como Autor
Y me encuentro en la página de agregar contenido
Cuando ingrese el título del mensaje
Y seleccione Publicar
Entonces debe mostrarse "El contenido no puede ser vacío"   