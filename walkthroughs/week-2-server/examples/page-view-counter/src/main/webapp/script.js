/** Fetches a random string from the server and adds it to the page. */
async function randomString() {
  const responseFromServer = await fetch('/page-views');
  const textFromResponse = await responseFromServer.text();

  const dateContainer = document.getElementById('page-views-container');
  dateContainer.innerText = textFromResponse;
}
