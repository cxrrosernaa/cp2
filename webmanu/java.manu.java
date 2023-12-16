function toggleNavbar() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
      x.className += " responsive";
    } else {
      x.className = "topnav";
    }
  }
  function showMore() {
    var moreText = document.getElementById("moreText");
    if (moreText.style.display === "none") {
      moreText.style.display = "block";
    } else {
      moreText.style.display = "none";
    }
  }
  function showWhatsAppNumber() {
    alert('+34 934827237');
}

  function showGitHubUsername() {
    alert('ManuFes');
}
