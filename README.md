# wmp-ui-demo

#3 Pre requirements in local machine
	1. install and configure Java JDK 8 or above
	2. install and configure maven and set local repo
	3. install InteliJ Idea (or simmialr tool)
	4. makesure framewrok module locally build or deploy in remote server
	5. makesure Chrom browser installed in local machine (at leaset one browsesr)

## How to setup framework in you local machine
	- git clone https://github.com/shiwantha-msc/wmp-ui-demo.git
	- go to bin directory
	- run batch file 'Create_Idea_Projects' and makesure build sucess
	- run batch file 'Build_Projects' and makesure build sucess
	
During the build process necessary module dependancies will get deploy in local machine before test execute.

## How to run test cases in CMD
	1. verify which profile configured in pom.xml in test module  (ex: <profile>BAT_Home</profile>)
	2. run cmd in test level 'mvn clean test -P<profile_name>'
			ex : mvn clean test -PBAT_Home
	

