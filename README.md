Unix Tools
====================
This repository has the simulated implementation of different unix-tools `wc, cut, head,
tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

# How To Install and Use.
* Copy the run-scripts folder in your machine.
* Set the path of run-scripts as environment variable in your machine.
* Copy the jar file in run-scripts.


## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * md_wc.sh filename

## cut :
#### Filters and gives the asked columns in given file.
    * md_cut.sh [options] filename
    options:- -f'1,2,3', -d','

## head:
#### Head gives the first `n` lines from the given files.
    * md_head.sh [-noOfLines] filename

## tail:
#### Tail gives the first `n` lines from the given files.
    * md_tail.sh [-noOfLines] filename


## sort:
#### Sorts the lines in a file.
    * md_sort.sh Filename [-r]

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * md_uniq.sh Filename

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * md_spaceReducer.sh InputFile outputFile
