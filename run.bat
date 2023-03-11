@echo off

echo ###############################################
echo #                                             #
echo #     Welcome to the Stay Online program!     #
echo #                                             #
echo ###############################################
echo.
echo ...............................................
echo ........... Compiling the Java program .........
echo ...............................................
echo.

rem Compile the Java program
javac StayOnline.java

echo ...............................................
echo ............ Running the Java program ..........
echo ...............................................
echo.

rem Run the Java program
java StayOnline

echo ...............................................
echo ............ Press any key to exit .............
echo ...............................................

rem Pause the script to keep the command window open
pause > nul
