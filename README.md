# C++_Patterns

# Step 1:
<p>Set up the following layout structure in the Visual Studio Code.</p>
<img src="./layout.png" alt="my_VSC_editor_layout">

# Step 2:
  The program in the .vscode/tasks.json will interconnect the three files such as pattern.cpp , input.txt and ouput.txt
# Step 3:
 # To Run the code, Keep the .cpp file as the main file and press ctrl+shift+B. Before that enter input required for your program in the input.txt file and the output will be generated in the output.txt file.
   Note: This method will work only in windows that too only if the default terminal is "CMD", because the code in tasks.json has been programmed for windows machine. 
   If you need to execute this in any other machine, then do the below method or copy the code in tasks.json and ask an equivalent code for the type of your machine(mac, linux,.etc)
# ALTERNATE EXECUTION METHOD :
  1. Open the CMD in the file path
  2. Enter the following command:
        # >> g++ <filename.cpp>
             (here it is : >> g++ patterns.cpp)
       Then, it generates 'a.exe' file in the same folder .
  3. To execute the "a.exe" file :
       # >> a.exe
