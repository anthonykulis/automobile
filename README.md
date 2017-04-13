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

Again, this will probably require time out of class. The deadline to submit is EOD, Friday April 21, 2017. I reserve the right to extend this by one week if needed.

 
## Tips to success

### Parts
You will have to implement some extensions of previous work. There may be a few, or there may be a lot. Make sure to document what needs to be completed *before* you start writing interfaces. You can create these extensions anytime you need. To make sure we do not have conficts from other groups, create a directory under you **trim** and call it `parts`. Under `parts`, create directories as needed and extend what you need. Team leaders can do this, or they can delegate these out. Up to the team leaders. Do not try and start coding the implementations before you have parts, you will just get a headache. We will start coding implementations of builders next Monday, so have these done before then.

### Builders
Team leaders are responsible for making sure the flowcharts, UML, builder interface, and builder implementations are correct for their team. I will be fairly hands off on this since the answer is online. If your teams work doesn't reflect this, the team leader and team member who wrote the code are responsible. This is a much more independent exercise done in teams then before.


### The `Automobile` class
This class is provided for you. When your builder calls `build()`, it should return an `Automobile`. You should able to call `System.out.println(automobile)` and it print out all options, packages, etc. This class takes some strings to identify which make, model, and trim the car is. This will be called automatically by the automobiles `toString` method.

## Grading

### Attendance
Each absence in the first two weeks costs 10 points up to a total of -30 points. Each day missed will cost you a letter grade. This is effective on Tuesday, April 11 through Friday April 17.

### Flow chart
Each flowchart must accurately represent the online builder already existing. Each PR requires a flowchart, and each flowchart must represent a trim. Flagrantly missing flows will be deducted at 5 points each.
 
### UML
Each trim requires a UML of the builder implemented. Most of these will be near identical. Some will not. Make sure to store your options in these implementations. Flagrantly missing UML parts will be deducted at 5 points each.

### Builder Interface
Each model will have 1 builder pattern interface. Because the entire team will use this, it is a team grade. A missing interface is not acceptable and will cost 20 points. Team leaders, please confer with me on the interface when designed. Of course it needs UML. Once I approve it, your team will use this interface for each builder implementation. Because of so, there will be no marks taken off for incorrect interfaces, but rather marks taken off for implementations of the interface that do not match.

### Builders
Each builder implementation requires UML and a flowchart. Because those are graded separately, you will be graded here on that representation. If your implementation doesn't reflect the interface, you will be deducted 5 points per interface that fails to meet this criteria. Each interface can only have 5 points taken off for this.

You will also be graded on asking options if required, encapsulating things that are not required to be answered by the user, etc. This is subjective.

### Mentoring
Team Leaders only. If you fail to provide your team members with the proper mentoring, you can lose up to 20 points subjectively.

### Team Members
If your team leader is trying to work with you and you fail to work at your team leaders discretion (eg get done by dates, uml and flowchart pull requests done as they wish, etc), you can lose up to 20 points subjectively.

### Unit Testing
You will not be graded on unit testing. Being said, if you have a problem in your source code and it is **NOT** tested, I most likely will deduct more severely. This is because your unit test tells me what you were trying to do and most likely you simply missed an edge case. If you do not unit test, I have no frame of reference. On the flip side, if you write spurious test cases to get you through the problem, and you have code issues, I might grade just as hard if there was no unit test. Your unit test is your CYA code. Failing to write them and test just sets you up for failure.


## Extra Credit
There will be no extra credit for this lab.