The try block can have zero or more catch blocks. However, a try block can have zero or only one finally block.

Note that if a try block has one or more catch blocks, then the finally block should be written only after the last catch block.

The finally block cannot appear before or in between the catch blocks.

 Valid
try {// try block} catch (ExceptionName1referenceName1) {// catch block} catch (ExceptionName2referenceName2) {// another catch block} finally {// finally block}
 Valid
try {// try block} catch (ExceptionClassNamereferenceName) {// catch block}
 Valid
try {// try block} finally {// finally block}Select all the correct usages of try, catch and finally blocks given below:




Answer

try {
    ...
 } catch (ExceptionClassName  referenceName) {
    ...
 } finally {	
    ...
 }


 
 
 try {
    ...
 } finally {	
    ...
 }