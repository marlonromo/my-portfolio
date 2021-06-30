

async function randomFavoriteMovie() {
  const responseFromServer = await fetch('/favoriteMovies');
  // The json() function returns an object that contains fields that we can
  // reference to create HTML.
  const stats = await responseFromServer.json();

  const movieContainer = document.getElementById('favoriteMovies-container');

  index = Math.floor(Math.random()*stats.length)

  movieContainer.innerText = stats[index];
}

/** Creates an <li> element containing text. */
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}
