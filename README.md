# phone-selction

### description of functinnaly  implmented :

the first interface is html Form  which help the user to choose a smartphone brand 
after clicking  the button submit we send  the parameter with resuest Post 
the servelet receives the request then instanciate the model to get a list of recommandation phones for that brand 
after that  the servlet map the list to variable parameter and forword it to jsp page 
the web container replaces the variables in JSP with actual values and send the response to user 

#### steps of implmenting the projetc via maven 

1-generate maven web app 

cd d:/
mvn archetype:generate -DgroupId=com.devtch -DartifactId=phone-selection -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

after maven projet generated  we have this : 

phone-slection |--> src |--> main |--> ressources
               |                  |-->web-app |--> WEB-INF --> web.xml
               |		          |           |--> index.html
               |--> pom.xml                       
 
 
our app should be :

phone-selction |--> pom.xml
               |--> src |--> main |--> java |--> com |--> devtch |--> model --> PhoneExpert.java
                                  |         |--> com |--> devtch |--> web   --> PhoneSelect.java
			                      |--> ressources
			                      |--> web-app |--> |--> WEB-INF --> web.xml
						                       |--> form.html
									           |--> result.jsp
phoneExpert.java : business logic ( Model )
result.jsp       : presentation   ( View )
PhoneSelect.java : servlet middleware between View && model (Controller )

==> we implement  MVC structure 

### test 

- clone this repository 
https://github.com/dev-tch/phone-selction.git
- From the folder phone-selction run
mvn clean install jetty:run
- Browse to http://localhost:8080/form.html




                 
