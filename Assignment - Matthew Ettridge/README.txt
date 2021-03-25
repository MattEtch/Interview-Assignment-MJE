How to run:
	
	The project is using gradle. Open your preffered IDE and import and existing project
	and select the root directory.
	IDE's like eclipse require you to use an Import Existing Gradle Project Option. 

Reasoning behind chosen implementation

	- The text reader method was constrained to its own class to improve readability and 
	decrease coupling. This also ensured anyone adding additional methods to the library         	wouldn't have to rewrite code to read a text file.

	- Scanner was chosen to read the text because I was familiar with it and it comes 
	with very useful methods that are well tested and documented. 

	- An interface for the algorithms was considered but since each calculation only 
	required a single unique method I opted against it.

	- Algorithms being their own class and inheriting from a text reader parent class
	to increase modularity was also considered but I opted against it because each 
	calculation only required one algorithm and having a class encoumpassing the full
	library  meant less objects needed to be created. Had each calculation involved more 
	than one method I would have used this approach to increase readability. 

	- Tests were designed to ensure that the outputs were correct even in unlikely 
	circumstances such as a text file comprised of only symbols or with varied 
	spacing sizes. These might be negatives depending on the libraries intended use
	but I decided that flexibility was more important so that all bases are covered.