# Automobile
This repository is for in-class projects completed by students at JALC in CPS206 spring 2017 term. 

## Overview
Breaking into 4 teams (4 people per team), you will be responsible for building a line of automobiles. Design will occur in class as a group, slices will be made and delegated to team leaders, who will in-turn slice into features for team members to complete.

The design can be found on [LucidCharts](https://goo.gl/q3Vm1t). Currently I only provide a base class to get the conversation in design rolling. We will as class populate this out.

## Methodology
1. Team leaders will fork this repository.
2. Team members will fork their team leaders repository.
3. Team leaders will assign a feature to be completed (and tested) to each team member creating a backlog of tasks. 
4. Team members will complete their assigned feature(s), committing to their own fork of the repository until their work is completed. 
5. Upon the feature completion, the team member will then make a pull request to the team leaders repository. 
6. The team leader will review the work for completeness, tests, etc, before they merge the team members code into their master branch. If a team member successfully has a feature pulled into the teams master and needs to start a new feature, they should update their personal fork with the teams fork, and start on the next feature. Please see me for the git steps to handle this properly.
7. Upon all team members completing their features and completing a pull request to the team leaders master, the team leader will then make a pull request to the project's repository. The team leader will then meet with me to participate in the design review so we may complete the pull request.
8. Once all teams have completed the pull request into the master repository, each student will then have an extra credit opportunity (scoped to project only) to then create a driver that creates multiple vehicles and stores them into a collection of type `Automobile`. Once numerous vehicles are created, the student then can iterate across this collection calling the `toString` method of the vehicle that will then print out the full description of the car.

## Requirements
* Each final class will have a unique `toString` method describing the instance. If the class has composites, it should call upon that composites `toString` method to help facilitate the overall response.
* Each class that has a composite will not store that composite class instance as the composite classes data type, but rather the logical parent classes. This means polymorphism should be heavily used.
	
		Wheel wheel = new ForgedWheel();
		
## Grading
This is a graded exercise. You will be graded at an individual level and at a team level. Do not delete your personal forked repositories. Other teams will be depending on your team, so if you fail as a team, we fail as a class. Being said, you pass as a team, or you fail as a team.

Team level criteria:

	1. You have a team fork with all team member pull requests (10 points, all or nothing)
	2. You communicate via github issues, code reviews, etc as needed (5 points, all or nothing)
	3. Your team code completes the design criteria in a timely manner (20 points, all or nothing)
	
Individual level criteria:

	1. You participate actively in project design (10 points, subjective)
	1. Attendence is mandatory. Late arrivals count as absent (20 points, 10 points lost per instance)
	2. You have daily commits (10 points, 2 points lost per instance)
	3. You complete your assigned tasks in a timely manner (5 points all or nothing)
	3. Your code is tested (10 points, 2 points lost per instance)
	3. Your code works as tested (10 points, 2 points lost per instance)

### Extra Credit
Extra credit will be given for those wishing to seek it. It will be 10 points added to the assignment, meaning you can earn 110/100. It will not be applied to the curve. One caveat, if a team fails to complete their portion, it will require you to complete it for them. Depending on the severity of code missing will determine what will be required to complete.


## Timeline

* 2 days to complete design as a class
* 1 day to form into teams and have team leaders slice up the work, fork repositories, etc.
* 5 days to complete the code. This includes review via pull requests. My suggestion is to set daily goals. Team leaders will need to validate tests are correct and that the code meets design requirements. This should be done during the pull request phase, but also needs to be monitored on daily goals. Team leaders, do not take too big of a bite. Delegate. You will probably need to confer with me multiple times. Allocate that time.

If we follow these steps, any time we complete early, e.g. the design phase, it can be used for the next phase. If we are having problems meeting this time table, as your CTO on this project, I have 3 tools I can use:

	1. Reduce scope of project
	2. Add more time
	3. Add more engineers (me)
	
I reserve the right to use any of these tools, but I will only do so if your team is properly communicating with you and you are properly communicating with me.