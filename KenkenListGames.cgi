#!/usr/bin/perl

use strict;
use CGI;

my $cgiform = new CGI;

print "Content-type: text/html\n";
print "Access-Control-Allow-Origin: *\n\n";

my $string = "java KenkenGameManager -l";
system ($string);
