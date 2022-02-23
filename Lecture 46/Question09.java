Given :
import java.util.Date;
import java.text.DateFormat;

DateFormat df;
Date date = new Date();
// insert code here
String s = df.format(date);
Which code fragment, inserted at // insert code here, allows the code to compile?


Answer  


df = DateFormat.getInstance();
