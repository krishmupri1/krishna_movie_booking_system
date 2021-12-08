# krishna_movie_booking_system

<H2>Admin Api</H2>

 <H3>*To add the City to the DB*</H3>
<br>URL: /api/city</br>
<br>Method: POST </br>

<H3>*To add theater to the DB *</H3>
<br>here theater reference to the key_id of the city as primary key so make sure to pass the valid city id</br> 
<br>URL: /api/{CityID}/theater</br>
<br>Method: POST</br>

<H3>To add the Movie to the DB</H3>
<br>URL: /api/movie</br> 
<br>Method: POST</br>



<H3>To add a show pass the theater Id and Movie id as a URL parma and the show time in the request body</H3>
<br>URL: /api/{theater_id}/{movie_id}/show</br>
<br>Method: POST</br>

<H2>End User Api's</H2>

<H3>When user comes to the app make a get call to below API to fetch the name of city available on the app</H3> 

<br>URL: /user/city</br>
<br>Method: GET</br>

<H3>To get the list of Theaters Available on the city using the city id got in the previous call</H3>
<BR>URL: /user/{cityID}/theater</BR>
</BR>Method: GET</BR>

<h3>Pass the show id to the below API to get the available seat for the movie/show</h3> 

<br>URL: /user/show/{ID}</br>
<br>Method: GET</br>

<H3> after user selects the theater pass the theater id to the below api and in return you'll get a list of movie available for the movie</H3>

<br>URL: /user/theater/{theaterID}/movie</br>
<br>Method: GET</br>

<H3>Get a list of show available agist a Movie using the movie ID got in the previous step<H3>
<br>URL: /user/movie/{id}/show</br>
<br>Method: GET</br>

<H3>Book a ticket for the show using the available seat for the response got in previous API call</h3>

<br>URL: /user/show/{ID}/bookings</br>
<br>Method: POST<br>



 
