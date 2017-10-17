# Reflection by Haeley Griffin

This lab required me to write a file called `ManipulateDNA`. In this lab we had
to use our skills we have learned thus far in the year to printout an
manipulate DNA string that was given to us from an outside document. To use
this document we had to use a scanner to pull the information from the document
in. We then had to read in and display the chosen DNA which I created a string
that  was all the information in the outside document. Next we had to create
the complement to the DNA string. This was more challenging because you did not
want to completely just switch them because then you would be changing letters
that had already  been changed so I decided to create strings that would change
one thing at a time replacing the letters with their complement using Uppercase
and Lowercase to distinguish between the ones that had been changed and the
ones that needed changed, then printed that out using a println statement. The
next step was to insert a randomly chosen DNA letter into the DNA string. This
was the hardest step for me but I solved this by using a random generator then
using that to get a randomnumber then corrolating that with a random letter in
the string. I then had to get a random position to insert it and used the
random generator again to do this. The next task was to delete a random letter
from the DNA and to do this I used the random generator to get the random
position that woukld be deleted then used substrings and said (0,random
position) + (random position + 1) to get all the letters up to the random
position then all the letters after but never inclue the position. The last
task was to change a random position to a random letter in the DNA and to do
this I combined the two above ideas to instert a random letter and remove one
of the letters and replace it with a letter from the sequence.

The most challenging part of this lab was working with substrings and
remembering all of the tricks like (0,random postion) goes from 0 to the
position but not including it and if you just type (random position) it will
take you from that position to the end. One problem I ran into when running my
program was when generating a random position I had int randomPosition =
generator.nextInt(5); which would run some of the time but it was coming up
with an instance where I would get -1 which was bcause it was tring to go to
position 4 and add 1 but there was nothing to add so it was taking it to the
begining and giving me -1. I fixed this by saying
generator.nextInt(dna.lenght()) which just used the length of an string not
just a string of 4 charater lenghts.
