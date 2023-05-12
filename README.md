# phone-selection

### description of functinnaly  implmented :

- the first interface is html Form  which helps the user to choose a smartphone brand 
- after clicking  the button submit ; we send  the parameter with resuest Post 
- the servelet receives the request then instanciates the model to get a list of recommandation smartphones for that brand 
- after that  the servlet map the list to variable parameter and forword it to jsp page 
- the web container replaces the variables in jsp  with actual values and sends the response to the user 

### parts MVC structure 

- phoneExpert.java : business logic ( Model )
- result.jsp       : presentation   ( View )
- PhoneSelect.java : servlet middleware between View && model (Controller )


### test 

- clone this repository 
https://github.com/dev-tch/phone-selction.git
- From the folder phone-selction run
mvn clean install jetty:run
- Browse to http://localhost:8080/form.html




                 
