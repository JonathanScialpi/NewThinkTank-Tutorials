use strict;
use warnings;
use diagnostics;

use feature 'say';

use feature "switch";

use v5.16;

print "Hello World\n";

my $name = 'Jonathan';
#scalar
my ($age, $street) = (40, '123 Main St');
my $my_info = "$name lives on \"$street\"\n";
$my_info = qq{$name lives on "$street"\n};
print $my_info;

my $bunch_of_info = <<"END";
This is a bunch of information
on multiple lines
END
say $bunch_of_info;

my $first =1;
my $second =2;
($first, $second) = ($second, $first);
say "$first $second";

my $long_string= "Random Long String";
say "Index 7 through 10 ", substr $long_string, 7, 4;

my $animal = "animals";
printf("Last character is %s\n", chop $animal);

my $upper = "uppercase";
printf("$upper %s", uc $upper);

$long_string =~ s/ /, /g;
say $long_string;

my $two_times = "What I said is " x 2;
say $two_times;

my @abcs = ('a'..'z');
print join(", ", @abcs), "\n";

#fun with arrays
my @primes = (2,3,5,7,11,13,17);
for my $info (@primes){
	say $info;
}

my @newArray = @primes[0,4];

for (@newArray){
	say $_;
}

say "Remove Index 0-2", splice @primes, 0,3;

print join (", ", @primes), "\n";

my $customers = "Sue Sally Paul";
my @cust_array = split / /, $customers;
print join(", ", @cust_array), " \n";
@cust_array = reverse @cust_array;
@cust_array = sort @cust_array;

#map example
my @number_array = (1,2,3,4,5,6,7,8);
my @dbl_array = map {$_ *2} @number_array;
print join(", ", @dbl_array), "\n";

#hashes
my %employees = (
 "Sue"=>35,
 "Paul"=>43,
 "Sam"=>39
 );
 
 printf("Sue is %d \n", $employees{Sue});
 $employees{Frank}=44;
 while (my ($k, $v) = each %employees){
 print "$k $v\n"}
 
 #set array to hash values 
 my @hashValues = %employees;
 my @someHashValues = @employees{"Sue", "Sam"};
 say @someHashValues;
 
 delete $employees{'Frank'};
 
 #check if exists
 say ((exists $employees{'Sam'}) ? "Sam is here " : "No Sam");
 
 for my $key (keys %employees){
	 if($employees{$key} == 35){
	 say "Hi Sue";
	 }
 }
 
 sub get_random {
	return int (rand 11);
 }
 
 sub get_random_max{
	my ($max_num) = @_;
	$max_num || 11;
	return int(rand $max_num);
	}
	say "Random Number", get_random_max(100);
	
sub get_sum{
	my($num_1, $num_2) = @_;
	$num_1 ||=1;
	$num_2 ||=2;
	
	return $num_1 + $num_2;
	}
	
	sub double_array{
	my @num_array = @_;
	$_ *= 2 for @num_array;
	return @num_array;
	}
	my @rand_array = (1,2,3,4,5);
	
	print join(", ", double_array(@rand_array));
	
	sub factorial {
	my ($num) = @_;
	return 0 if $num <=0;
	return 1 if $num ==1;
	return $num * factorial($num - 1);
	}
	
	say "Factorial of 4: ", factorial(4);
