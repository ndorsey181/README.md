<!DOCTYPE html>
<html lang="en">
<head>
<style>
  body {
 background-color: black;} 
body {
color: white;}
h1 {color: #FFDE21;}
h2 {text-align: center ;}
</style>
<style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    * {
         box-sizing: border-box;
       }
       
       body {
         margin: 0;
       }
       
       /* Style the header */
       .header {
         background-color: #f1f1f1;
         padding: 20px;
         text-align: center;
       }
       
       /* Style the top navigation bar */
       .topnav {
         overflow: hidden;
         background-color: #333;
       }
       
       /* Style the topnav links */
       .topnav a {
         float: left;
         display: block;
         color: #f2f2f2;
         text-align: center;
         padding: 14px 16px;
         text-decoration: none;
       }
       
       /* Change color on hover */
       .topnav a:hover {
         background-color: #ddd;
         color: black;
       }
       
       /* Create three equal columns that floats next to each other */
       .column {
         float: left;
         width: 33.33%;
         padding: 15px;
       }
       /* Clear floats after the columns */
       .row::after {
         content: "";
         display: table;
         clear: both;
       }
        /* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
       @media screen and (max-width:600px) {
         .column {
           width: 100%;
         }
       }
       </style>
       <head></head>
       <body>
        <div class="header">
            <h1>Movie Exclusives</h1>
            <p> </p>
          </div>
             <!--This part needs to be Updated for Js the three tabs. -->
             <!--Make Sure to save the links home, Movie News, Screenings tickts, Shop Merch -->
            <div class="topnav">
            <a href="file:///C:/Users/shake/OneDrive/Desktop/MovieStart.style.css/Website%20%231.html" target="_blank">Home</a>
            <a href="file:///C:/Users/shake/OneDrive/Desktop/MovieStart.style.css/Website%20%232.html" target="_blank">Movie News</a> 
            <a href="file:///C:/Users/shake/OneDrive/Desktop/MovieStart.style.css/Website%20%23%203.html" target="_blank">Screenings tickets </a>
            <a href="file:///C:/Users/shake/Downloads/index.html/search%20bar%20css%202.html" target="_blank" >Shop Merch</a>
          
        </div>
        <div class="row">
          <div class="column">
           <h2>Movie #1 </h2>
            <p>Movie #1 was released this Monday. 
           <p class="thicker">Halloween</p> After being committed for 15 yaers, Michael Myers, now a gown man nd still very dangerous, 
           escapes from the mental instituition and immediately returns to Haddonfield to find his baby sister, Laurie. 
              <img src="popcorn.pic.yellow"> </p>
        
            </div>
            <div class="column">
               <h2>Movie #2 </h2>
               <p>Movie #2 was released this Tuesday. 
               <p class="thicker">Annabelle</p> A couple begins to experience terrifying supernatural occurences involving 
               a vintage doll shortly aftre their home is invaded by satanic cultists. <img src="popcorn.pic.yellow"> </p> 
             </div>
             <div class="column">
               <h2>Movie #3</h2>
               <p>Movie #3 was released this Wednesday.
                <p class="thicker">Terrifier</p> A maniac named Art the Clown terrorizes two friends on Halloween 
                everyone who gets in his way. <img src="popcorn.pic.yellow"> </p>
            </div>
        </div>
      </div>
       </body>
      </html>
      </body>
      </html>
       <html>
       
      </html>   
    <!--First API Search Engine for the Home Page-->
    <title> Search Home Page</title>
    <link type="text/css" rel="stylesheet" href="css/index.css">
    <script src="js/index.js"></script>
</head>
<body onload="page_load()">
    <nav>
        <a href="index.html">Home</a> | 
        <a href="api-demo-1.html">Movies library</a> | 
        <a href="giphy-api-demo-1.html">Last Sales</a>
    </nav>
    <main>
        <header>
            <h3> What was your favorite Movie? </h3>
        </header>
        <P></P>
        <section>
            <P></P>
            <div id="output" class="output"></div>
            <p></p>
        </section>
        <p></p>
        <div>
            <button onclick="js_obj_ex1()">Movie #1</button>
            <button onclick="js_obj_ex2()">Movie #2</button>
            <button onclick="js_obj_ex3()">Movie #3</button>            
        </div>
        <P></P>
        <footer>
            footer @ 2024 
        </footer>
    </main>
</body>
</html>