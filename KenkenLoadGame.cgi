#!/usr/bin/perl

use strict;
use CGI;

binmode(STDOUT, ":utf8");

print "Content-Type: text/html; charset=utf-8\n";
print "Access-Control-Allow-Origin: *\n\n";

my $string = "java KenkenGameManager -L -n kenken1.xml";

system ($string);
