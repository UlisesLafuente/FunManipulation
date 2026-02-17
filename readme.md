# Functional manipulation of data

Now that you have the foundations, you will focus on transforming collections in a more complex and expressive way. You will work with more specific conditions, combined operations and direct modifications of the elements. In addition, you will create functional interfaces to represent arithmetic operations as reusable functions, approaching the functional paradigm.

## Enunciate: 

Exercise 1
Create a list of strings with proper names. Write a method that returns a list of all strings starting with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.

Exercise 2
Program a method that returns a chain separated by commas, based on a list ofIntegers. Each element must be preceded by letter “e” if the number is even, or by the letter “o” if the number is odd. For example, if the input list is (3, 55, 44), the output must be “o3, o55, e44”. Print the result.

Exercise 3
Create a Functional Interface that contains a method called operacio(). This method must return a float. Inject into the interface created by a lambda, the body of the method, so that the operation can be transformed with a sum, a subtraction, a multiplication and a division.

Exercise 4
Create a list that contains some strings of text and numbers.

Sort them by:

    Alphabetically for the first character. (Note: charAt(0)return the numeric code of the first character)
    The chains that contain an "e" first, the rest of the chains after. Put the code directly into the lambda.
    Change all the items in the list that have an ‘a’. Modify the ‘a’ for a ‘4’.
    Show only elements that are numerical. (Even if they are saved as Strings).

--------------------------------------------------------------------------  
Copyright 2026 Ulises Lafuente Ramos

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.