Installing Java 8 on Ubuntu

First you need to add webupd8team Java PPA repository in your system and install Oracle Java 8 using following set of commands.

$ sudo add-apt-repository ppa:webupd8team/java

$ sudo apt-get update

$ sudo apt-get install oracle-java8-installer

Verify Installed Java Version

After successfully installing oracle Java using above step verify installed version using following command.

$ java -version

Configuring Java Environment

In Webupd8 ppa repository also providing a package to set environment variables, Install this package using following command.

$ sudo apt-get install oracle-java8-set-default
