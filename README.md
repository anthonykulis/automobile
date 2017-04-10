# Automobile (WIP)
This second iteration of in-class lab for cps206 takes the domain modeling completed in the first part and will build a series of automobiles.

## Technical 
Using [dodge](http://www.dodge.com/en/lineup/?app=bmo) and [ram](http://www.ramtrucks.com/hostc/bmo/CUT201713/models.do?ccode=CUT201713DS1L61B&llp=2TB), 4 teams will build a line of vehicles. 

Each trim level of the model will be implemented using the builder pattern.

The builder interface will be designed together in class. For our case, the builder interface is meant to build classes to be used by 3rd party developers. This means you will need to interact with those users. Provided is a human interface (prompting) that will allow this to happen. You will be required to build a flow diagram representing the human interaction. You will also need to provide the UML for each builder implemented. 


### Flow Chart
The flow chart is responsible for demonstrating what the teams chosen model represents online. A flow chart _for each_ trim is required. The developer doing the trim is responsible for this flow chart. This means if there are 11 trims, there should be 11 flow charts overall. 

### UML
Each trim will have a builder which means each trim will have UML. Again, the developer writing the trim is responsible for the UML. 

## Timeline
For the week of April 10, I expect mostly design. You will probably need to try out my prompter classes to get an idea how they work. Feel free to do so, but do not commit code that is purposed for R & D.

For the week of April 17, I expect mostly code. For each implementation, create a separate pull request to your team leaders repository. That pull request should be titled as the `[TRIM] Builder` and have the UML and flowchart. Once completed and approved by the team leader, the team leader should merge that pull request and the team update their fork of the repository.

Again, this will probably require time out of class. The deadline to submit is EOD, Friday April 21, 2017.
 
## Grading
TBD.