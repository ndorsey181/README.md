<!DOCTYPE html>
<html lang="en">
       <style>
            body {
                background-color: rgb(236, 230, 230);
            } 
            
            body {
        color: white;
    }
     h1 {
            color: #FFDE21;
         }
         h2 {
            text-align: center ;
         }
       </style>
       <meta charset="utf-8">
       <meta name="viewport" content="width=device-width, initial-scale=3.0">
       <style>
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
       
       <div class="topnav">
       <a href="#" target="_blank">Shop Merch</a> 
       </div>
       
       <body> 
       <div>
        <h1> Exclusive Movie Shop </h1>
        <p> Enter the Movie name to see the shirt!</p>
        <input type="text" placeholder="Search.." name="search">
        <!--Give Value to Search button-->
        <p id="demo"></p>
        <button type="button" onclick='document.getElementById("submit").innerHTML= 
        "Customer!"'>Search</button>
        </style>
        </div> 
        
        <!--Javascript 1(demo)-->
        <html>
        <head>
        <script>
        function myfunction() {
          document.getElementById("demo").innerHTML = "Paragraph changed.";
        }
        </script>
        </head>
        <body>
        <p>Demo javscript in head </p>
        <p id="demo"> A paragraph</p>
        <button type="button" onclick="myFunction()">Try it</button>
        </body>  
        </html>
        
        </html>
        <head>
        <link href='https://fonts.googleapis.com/css?family=Aguafina Script'
        rel='stylesheet'>
        <style>
          body {font-family: 'Aguafina Script';font-size: 20px; color: rgba(184, 14, 14, 0.926); }
        </style>