import java.util.HashSet;
import java.util.Set;

public class Data {

	public static String[][] SCORES = new String[][] {
		{"Florida","24","Miami (FL)","20"},
		{"Hawaii","45","Arizona","38"},
		{"Alabama-Birmingham","24","Alabama State","19"},
		{"Arizona State","30","Kent State","7"},
		{"Bowling Green State","46","Morgan State","3"},
		{"Buffalo","38","Robert Morris","10"},
		{"Central Arkansas","35","Western Kentucky","28"},
		{"Central Florida","62","Florida A&M","0"},
		{"Central Michigan","38","Albany","21"},
		{"Cincinnati","24","UCLA","14"},
		{"Clemson","52","Georgia Tech","14"},
		{"Connecticut","24","Wagner","21"},
		{"Minnesota","28","South Dakota State","21"},
		{"San Jose State","35","Northern Colorado","18"},
		{"Texas A&M","41","Texas State","7"},
		{"Tulane","42","Florida International","14"},
		{"Utah","30","Brigham Young","12"},
		{"Army","14","Rice","7"},
		{"Colorado","52","Colorado State","31"},
		{"Michigan State","28","Tulsa","7"},
		{"Nevada","34","Purdue","31"},
		{"Oklahoma State","52","Oregon State","36"},
		{"Rutgers","48","Massachusetts","21"},
		{"Wake Forest","38","Utah State","35"},
		{"Wisconsin","49","South Florida","0"},
		{"Air Force","48","Colgate","7"},
		{"Alabama","42","Duke","3"},
		{"Appalachian State","42","East Tennessee State","7"},
		{"Arkansas","20","Portland State","13"},
		{"Auburn","27","Oregon","21"},
		{"Baylor","56","Stephen F. Austin","17"},
		{"Boise State","36","Florida State","31"},
		{"Boston College","35","Virginia Tech","28"},
		{"California","27","California-Davis","13"},
		{"Charlotte","49","Gardner-Webb","28"},
		{"Eastern Michigan","30","Coastal Carolina","23"},
		{"Georgia","30","Vanderbilt","6"},
		{"Georgia State","38","Tennessee","30"},
		{"Illinois","42","Akron","3"},
		{"Indiana","34","Ball State","24"},
		{"Iowa","38","Miami (OH)","14"},
		{"Iowa State","29","Northern Iowa","26"},
		{"Kansas","24","Indiana State","17"},
		{"Kansas State","49","Nicholls State","14"},
		{"Kentucky","38","Toledo","24"},
		{"Louisiana State","55","Georgia Southern","3"},
		{"Louisiana-Monroe","31","Grambling State","9"},
		{"Marshall","56","Virginia Military Institute","17"},
		{"Maryland","79","Howard","0"},
		{"Memphis","15","Mississippi","10"},
		{"Michigan","40","Middle Tennessee State","21"},
		{"Mississippi State","38","Louisiana","28"},
		{"Navy","45","Holy Cross","7"},
		{"Nebraska","35","South Alabama","21"},
		{"Nevada-Las Vegas","56","Southern Utah","23"},
		{"New Mexico","39","Sam Houston State","31"},
		{"North Carolina","24","South Carolina","20"},
		{"North Carolina State","34","East Carolina","6"},
		{"North Texas","51","Abilene Christian","31"},
		{"Northern Illinois","24","Illinois State","10"},
		{"Ohio","41","Rhode Island","20"},
		{"Ohio State","45","Florida Atlantic","21"},
		{"Old Dominion","24","Norfolk State","21"},
		{"Penn State","79","Idaho","7"},
		{"San Diego State","6","Weber State","0"},
		{"Southern California","31","Fresno State","23"},
		{"Southern Methodist","37","Arkansas State","30"},
		{"Southern Mississippi","38","Alcorn State","10"},
		{"Stanford","17","Northwestern","7"},
		{"Syracuse","24","Liberty","0"},
		{"Temple","56","Bucknell","12"},
		{"Texas","45","Louisiana Tech","14"},
		{"Texas Christian","39","Arkansas-Pine Bluff","7"},
		{"Texas Tech","45","Montana State","10"},
		{"Texas-El Paso","36","Houston Baptist","34"},
		{"Texas-San Antonio","35","Incarnate Word","7"},
		{"Troy","43","Campbell","14"},
		{"Virginia","30","Pittsburgh","14"},
		{"Washington","47","Eastern Washington","14"},
		{"Washington State","58","New Mexico State","7"},
		{"West Virginia","20","James Madison","13"},
		{"Western Michigan","48","Monmouth","13"},
		{"Wyoming","37","Missouri","31"},
		{"Oklahoma","49","Houston","31"},
		{"Notre Dame","35","Louisville","17"},
		{"Arizona State","19","Sacramento State","7"},
		{"Boise State","14","Marshall","7"},
		{"Virginia","52","William & Mary","17"},
		{"Wake Forest","41","Rice","21"},
		{"Alabama","62","New Mexico State","10"},
		{"Alabama-Birmingham","31","Akron","20"},
		{"Appalachian State","56","Charlotte","41"},
		{"Arizona","65","Northern Arizona","41"},
		{"Arkansas State","43","Nevada-Las Vegas","17"},
		{"Auburn","24","Tulane","6"},
		{"Ball State","57","Fordham","29"},
		{"Baylor","63","Texas-San Antonio","14"},
		{"Boston College","45","Richmond","13"},
		{"Brigham Young","29","Tennessee","26"},
		{"California","20","Washington","19"},
		{"Central Florida","48","Florida Atlantic","14"},
		{"Clemson","24","Texas A&M","10"},
		{"Coastal Carolina","12","Kansas","7"},
		{"Colorado","34","Nebraska","31"},
		{"Colorado State","38","Western Illinois","13"},
		{"Duke","45","North Carolina A&T","13"},
		{"East Carolina","48","Gardner-Webb","9"},
		{"Florida","45","Tennessee-Martin","0"},
		{"Florida State","45","Louisiana-Monroe","44"},
		{"Georgia","63","Murray State","17"},
		{"Georgia Southern","26","Maine","18"},
		{"Georgia State","48","Furman","42"},
		{"Georgia Tech","14","South Florida","10"},
		{"Hawaii","31","Oregon State","28"},
		{"Houston","37","Prairie View A&M","17"},
		{"Illinois","31","Connecticut","23"},
		{"Indiana","52","Eastern Illinois","0"},
		{"Iowa","30","Rutgers","0"},
		{"Kansas State","52","Bowling Green State","0"},
		{"Kent State","26","Kennesaw State","23"},
		{"Kentucky","38","Eastern Michigan","17"},
		{"Louisiana","35","Liberty","14"},
		{"Louisiana State","45","Texas","38"},
		{"Louisiana Tech","20","Grambling State","14"},
		{"Louisville","42","Eastern Kentucky","0"},
		{"Maryland","63","Syracuse","20"},
		{"Memphis","55","Southern","24"},
		{"Miami (OH)","48","Tennessee Tech","17"},
		{"Michigan","24","Army","21"},
		{"Michigan State","51","Western Michigan","17"},
		{"Middle Tennessee State","45","Tennessee State","26"},
		{"Minnesota","38","Fresno State","35"},
		{"Mississippi","31","Arkansas","17"},
		{"Mississippi State","38","Southern Mississippi","15"},
		{"Missouri","38","West Virginia","7"},
		{"North Carolina","28","Miami (FL)","25"},
		{"North Carolina State","41","Western Carolina","0"},
		{"Ohio State","42","Cincinnati","0"},
		{"Oklahoma","70","South Dakota","14"},
		{"Oklahoma State","56","McNeese State","14"},
		{"Oregon","77","Nevada","6"},
		{"Penn State","45","Buffalo","13"},
		{"Pittsburgh","20","Ohio","10"},
		{"Purdue","42","Vanderbilt","24"},
		{"San Diego State","23","UCLA","14"},
		{"South Alabama","37","Jackson State","14"},
		{"South Carolina","72","Charleston Southern","10"},
		{"Southern California","45","Stanford","20"},
		{"Southern Illinois","45","Massachusetts","20"},
		{"Southern Methodist","49","North Texas","27"},
		{"Texas Tech","38","Texas-El Paso","3"},
		{"Tulsa","34","San Jose State","16"},
		{"Utah","35","Northern Illinois","17"},
		{"Utah State","62","Stony Brook","7"},
		{"Virginia Tech","31","Old Dominion","17"},
		{"Washington State","59","Northern Colorado","17"},
		{"Western Kentucky","20","Florida International","14"},
		{"Wisconsin","61","Central Michigan","0"},
		{"Wyoming","23","Texas State","14"},
		{"Kansas","48","Boston College","24"},
		{"Wake Forest","24","North Carolina","18"},
		{"Washington State","31","Houston","24"},
		{"Air Force","30","Colorado","23"},
		{"Alabama","47","South Carolina","23"},
		{"Arizona","28","Texas Tech","14"},
		{"Arizona State","10","Michigan State","7"},
		{"Arkansas","55","Colorado State","34"},
		{"Army","31","Texas-San Antonio","13"},
		{"Auburn","55","Kent State","16"},
		{"Boise State","45","Portland State","10"},
		{"Brigham Young","30","Southern California","27"},
		{"California","23","North Texas","17"},
		{"Central Florida","45","Stanford","27"},
		{"Central Michigan","45","Akron","24"},
		{"Charlotte","52","Massachusetts","17"},
		{"Cincinnati","35","Miami (OH)","13"},
		{"Citadel","27","Georgia Tech","24"},
		{"Clemson","41","Syracuse","6"},
		{"Coastal Carolina","46","Norfolk State","7"},
		{"Duke","41","Middle Tennessee State","18"},
		{"Eastern Michigan","34","Illinois","31"},
		{"Florida","29","Kentucky","21"},
		{"Florida Atlantic","41","Ball State","31"},
		{"Florida International","30","New Hampshire","17"},
		{"Georgia","55","Arkansas State","0"},
		{"Iowa","18","Iowa State","17"},
		{"Kansas State","31","Mississippi State","24"},
		{"Liberty","35","Buffalo","17"},
		{"Louisiana","77","Texas Southern","6"},
		{"Louisiana State","65","Northwestern State","14"},
		{"Louisiana Tech","35","Bowling Green State","7"},
		{"Louisville","38","Western Kentucky","21"},
		{"Marshall","33","Ohio","31"},
		{"Memphis","42","South Alabama","6"},
		{"Miami (FL)","63","Bethune-Cookman","0"},
		{"Minnesota","35","Georgia Southern","32"},
		{"Mississippi","40","Southeastern Louisiana","29"},
		{"Missouri","50","Southeast Missouri State","0"},
		{"Navy","42","East Carolina","10"},
		{"Nebraska","44","Northern Illinois","8"},
		{"Nevada","19","Weber State","13"},
		{"Northwestern","30","Nevada-Las Vegas","14"},
		{"Notre Dame","66","New Mexico","14"},
		{"Ohio State","51","Indiana","10"},
		{"Oklahoma","48","UCLA","14"},
		{"Oklahoma State","40","Tulsa","21"},
		{"Oregon","35","Montana","3"},
		{"Oregon State","45","Cal Poly","7"},
		{"Penn State","17","Pittsburgh","10"},
		{"San Diego State","31","New Mexico State","10"},
		{"South Florida","55","South Carolina State","16"},
		{"Southern Methodist","47","Texas State","17"},
		{"Southern Mississippi","47","Troy","42"},
		{"Temple","20","Maryland","17"},
		{"Tennessee","45","Chattanooga","0"},
		{"Texas","48","Rice","13"},
		{"Texas A&M","62","Lamar","3"},
		{"Texas Christian","34","Purdue","13"},
		{"Toledo","45","Murray State","0"},
		{"Tulane","58","Missouri State","6"},
		{"Utah","31","Idaho State","0"},
		{"Virginia","31","Florida State","24"},
		{"Virginia Tech","24","Furman","17"},
		{"Washington","52","Hawaii","20"},
		{"West Virginia","44","North Carolina State","27"},
		{"Western Michigan","57","Georgia State","10"},
		{"Wyoming","21","Idaho","16"},
		{"Tulane","38","Houston","31"},
		{"Boise State","30","Air Force","19"},
		{"Southern California","30","Utah","23"},
		{"Alabama","49","Southern Mississippi","7"},
		{"Alabama-Birmingham","35","South Alabama","3"},
		{"Appalachian State","34","North Carolina","31"},
		{"Arkansas State","41","Southern Illinois","28"},
		{"Army","52","Morgan State","21"},
		{"Auburn","28","Texas A&M","20"},
		{"Baylor","21","Rice","13"},
		{"Boston College","30","Rutgers","16"},
		{"Buffalo","38","Temple","22"},
		{"California","28","Mississippi","20"},
		{"Clemson","52","Charlotte","10"},
		{"Coastal Carolina","62","Massachusetts","28"},
		{"Colorado","34","Arizona State","31"},
		{"East Carolina","19","William & Mary","7"},
		{"Eastern Michigan","34","Central Connecticut State","29"},
		{"Florida","34","Tennessee","3"},
		{"Florida Atlantic","42","Wagner","7"},
		{"Florida State","35","Louisville","24"},
		{"Fresno State","34","Sacramento State","20"},
		{"Georgia","23","Notre Dame","17"},
		{"Hawaii","35","Central Arkansas","16"},
		{"Indiana","38","Connecticut","3"},
		{"Iowa State","72","Louisiana-Monroe","20"},
		{"Kent State","62","Bowling Green State","20"},
		{"Liberty","62","Hampton","27"},
		{"Louisiana","45","Ohio","25"},
		{"Louisiana State","66","Vanderbilt","38"},
		{"Louisiana Tech","43","Florida International","31"},
		{"Miami (FL)","17","Central Michigan","12"},
		{"Michigan State","31","Northwestern","10"},
		{"Mississippi State","28","Kentucky","13"},
		{"Missouri","34","South Carolina","14"},
		{"Nebraska","42","Illinois","38"},
		{"Nevada","37","Texas-El Paso","21"},
		{"New Mexico","55","New Mexico State","52"},
		{"North Carolina State","34","Ball State","23"},
		{"North Texas","45","Texas-San Antonio","3"},
		{"Ohio State","76","Miami (OH)","5"},
		{"Oregon","21","Stanford","6"},
		{"Pittsburgh","35","Central Florida","34"},
		{"San Jose State","31","Arkansas","24"},
		{"Southern Methodist","41","Texas Christian","38"},
		{"Syracuse","52","Western Michigan","33"},
		{"Texas","36","Oklahoma State","30"},
		{"Texas State","37","Georgia State","34"},
		{"Toledo","41","Colorado State","35"},
		{"Troy","35","Akron","7"},
		{"Tulsa","24","Wyoming","21"},
		{"UCLA","67","Washington State","63"},
		{"Utah State","23","San Diego State","17"},
		{"Virginia","28","Old Dominion","17"},
		{"Wake Forest","49","Elon","7"},
		{"Washington","45","Brigham Young","19"},
		{"West Virginia","29","Kansas","24"},
		{"Wisconsin","35","Michigan","14"},
		{"Memphis","35","Navy","23"},
		{"Air Force","41","San Jose State","24"},
		{"Arizona State","24","California","17"},
		{"Duke","45","Virginia Tech","10"},
		{"Penn State","59","Maryland","0"},
		{"Alabama","59","Mississippi","31"},
		{"Appalachian State","56","Coastal Carolina","37"},
		{"Arizona","20","UCLA","17"},
		{"Arkansas State","50","Troy","43"},
		{"Auburn","56","Mississippi State","23"},
		{"Baylor","23","Iowa State","21"},
		{"Central Florida","56","Connecticut","21"},
		{"Cincinnati","52","Marshall","14"},
		{"Clemson","21","North Carolina","20"},
		{"East Carolina","24","Old Dominion","21"},
		{"Florida","38","Towson","0"},
		{"Florida Atlantic","45","Charlotte","27"},
		{"Florida State","31","North Carolina State","13"},
		{"Fresno State","30","New Mexico State","17"},
		{"Hawaii","54","Nevada","3"},
		{"Houston","46","North Texas","25"},
		{"Iowa","48","Middle Tennessee State","3"},
		{"Liberty","17","New Mexico","10"},
		{"Louisiana","37","Georgia Southern","24"},
		{"Louisiana Tech","23","Rice","20"},
		{"Louisiana-Monroe","30","South Alabama","17"},
		{"Massachusetts","37","Akron","29"},
		{"Miami (OH)","34","Buffalo","20"},
		{"Michigan","52","Rutgers","0"},
		{"Michigan State","40","Indiana","31"},
		{"Minnesota","38","Purdue","31"},
		{"Notre Dame","35","Virginia","20"},
		{"Ohio State","48","Nebraska","7"},
		{"Oklahoma","55","Texas Tech","16"},
		{"Oklahoma State","26","Kansas State","13"},
		{"Pittsburgh","17","Delaware","14"},
		{"South Carolina","24","Kentucky","7"},
		{"Southern Methodist","48","South Florida","21"},
		{"Southern Mississippi","31","Texas-El Paso","13"},
		{"Stanford","31","Oregon State","28"},
		{"Syracuse","41","Holy Cross","3"},
		{"Temple","24","Georgia Tech","2"},
		{"Texas A&M","31","Arkansas","27"},
		{"Texas Christian","51","Kansas","14"},
		{"Texas State","24","Nicholls State","3"},
		{"Toledo","28","Brigham Young","21"},
		{"Utah","38","Washington State","13"},
		{"Utah State","34","Colorado State","24"},
		{"Vanderbilt","24","Northern Illinois","18"},
		{"Wake Forest","27","Boston College","24"},
		{"Washington","28","Southern California","14"},
		{"Western Kentucky","20","Alabama-Birmingham","13"},
		{"Western Michigan","31","Central Michigan","15"},
		{"Wisconsin","24","Northwestern","15"},
		{"Wyoming","53","Nevada-Las Vegas","17"},
		{"Georgia Southern","20","South Alabama","17"},
		{"Temple","27","East Carolina","17"},
		{"Cincinnati","27","Central Florida","24"},
		{"San Jose State","32","New Mexico","21"},
		{"Alabama-Birmingham","35","Rice","20"},
		{"Arizona","35","Colorado","30"},
		{"Ball State","27","Northern Illinois","20"},
		{"Baylor","31","Kansas State","12"},
		{"Boise State","38","Nevada-Las Vegas","13"},
		{"Central Michigan","42","Eastern Michigan","16"},
		{"Florida","24","Auburn","13"},
		{"Florida International","44","Massachusetts","0"},
		{"Georgia","43","Tennessee","14"},
		{"Georgia State","52","Arkansas State","38"},
		{"Iowa State","49","Texas Christian","24"},
		{"Liberty","20","New Mexico State","13"},
		{"Louisiana State","42","Utah State","6"},
		{"Louisville","41","Boston College","39"},
		{"Maryland","48","Rutgers","7"},
		{"Memphis","52","Louisiana-Monroe","33"},
		{"Michigan","10","Iowa","3"},
		{"Middle Tennessee State","24","Marshall","13"},
		{"Minnesota","40","Illinois","17"},
		{"Mississippi","31","Vanderbilt","6"},
		{"Missouri","42","Troy","10"},
		{"Navy","34","Air Force","25"},
		{"Nebraska","13","Northwestern","10"},
		{"North Carolina","38","Georgia Tech","22"},
		{"Notre Dame","52","Bowling Green State","0"},
		{"Ohio","21","Buffalo","20"},
		{"Ohio State","34","Michigan State","10"},
		{"Oklahoma","45","Kansas","20"},
		{"Oregon","17","California","7"},
		{"Oregon State","48","UCLA","31"},
		{"Penn State","35","Purdue","7"},
		{"Pittsburgh","33","Duke","30"},
		{"San Diego State","24","Colorado State","10"},
		{"South Florida","48","Connecticut","22"},
		{"Southern Methodist","43","Tulsa","37"},
		{"Stanford","23","Washington","13"},
		{"Texas","42","West Virginia","31"},
		{"Texas Tech","45","Oklahoma State","35"},
		{"Texas-San Antonio","26","Texas-El Paso","16"},
		{"Toledo","31","Western Michigan","24"},
		{"Tulane","42","Army","33"},
		{"Virginia Tech","42","Miami (FL)","35"},
		{"Western Kentucky","20","Old Dominion","3"},
		{"Wisconsin","48","Kent State","0"},
		{"Appalachian State","17","Louisiana","7"},
		{"Louisiana-Monroe","24","Texas State","14"},
		{"North Carolina State","16","Syracuse","10"},
		{"Colorado State","35","New Mexico","21"},
		{"Miami (FL)","17","Virginia","9"},
		{"Oregon","45","Colorado","3"},
		{"Air Force","43","Fresno State","24"},
		{"Alabama","47","Texas A&M","28"},
		{"Alabama-Birmingham","33","Texas-San Antonio","14"},
		{"Arizona State","38","Washington State","34"},
		{"Ball State","29","Eastern Michigan","23"},
		{"Baylor","33","Texas Tech","30"},
		{"Boise State","59","Hawaii","37"},
		{"Bowling Green State","20","Toledo","7"},
		{"Central Michigan","42","New Mexico State","28"},
		{"Cincinnati","38","Houston","23"},
		{"Clemson","45","Florida State","14"},
		{"Duke","41","Georgia Tech","23"},
		{"Florida Atlantic","28","Middle Tennessee State","13"},
		{"Florida International","48","Charlotte","23"},
		{"Georgia State","31","Coastal Carolina","21"},
		{"Indiana","35","Rutgers","0"},
		{"Iowa State","38","West Virginia","14"},
		{"Kent State","26","Akron","3"},
		{"Kentucky","24","Arkansas","20"},
		{"Louisiana State","42","Florida","28"},
		{"Louisiana Tech","69","Massachusetts","21"},
		{"Louisville","62","Wake Forest","59"},
		{"Marshall","31","Old Dominion","17"},
		{"Michigan","42","Illinois","25"},
		{"Minnesota","34","Nebraska","7"},
		{"Missouri","38","Mississippi","27"},
		{"Navy","45","Tulsa","17"},
		{"Nevada","41","San Jose State","38"},
		{"Nevada-Las Vegas","34","Vanderbilt","10"},
		{"Northern Illinois","39","Ohio","36"},
		{"Notre Dame","30","Southern California","27"},
		{"Oklahoma","34","Texas","27"},
		{"Penn State","17","Iowa","12"},
		{"Purdue","40","Maryland","14"},
		{"San Diego State","26","Wyoming","22"},
		{"South Carolina","20","Georgia","17"},
		{"South Florida","27","Brigham Young","23"},
		{"Southern Mississippi","45","North Texas","27"},
		{"Temple","30","Memphis","28"},
		{"Tennessee","20","Mississippi State","10"},
		{"Tulane","49","Connecticut","7"},
		{"Utah","52","Oregon State","7"},
		{"Virginia Tech","34","Rhode Island","17"},
		{"Washington","51","Arizona","27"},
		{"Western Kentucky","17","Army","8"},
		{"Western Michigan","38","Miami (OH)","16"},
		{"Wisconsin","38","Michigan State","0"},
		{"Troy","37","South Alabama","13"},
		{"Louisiana","37","Arkansas State","20"},
		{"UCLA","34","Stanford","16"},
		{"Fresno State","56","Nevada-Las Vegas","27"},
		{"Ohio State","52","Northwestern","3"},
		{"Pittsburgh","27","Syracuse","20"},
		{"Air Force","56","Hawaii","26"},
		{"Alabama","35","Tennessee","13"},
		{"Alabama-Birmingham","38","Old Dominion","14"},
		{"Appalachian State","52","Louisiana-Monroe","7"},
		{"Auburn","51","Arkansas","10"},
		{"Ball State","52","Toledo","14"},
		{"Baylor","45","Oklahoma State","27"},
		{"Boston College","45","North Carolina State","24"},
		{"Brigham Young","28","Boise State","25"},
		{"Buffalo","21","Akron","0"},
		{"Central Florida","41","East Carolina","28"},
		{"Central Michigan","38","Bowling Green State","20"},
		{"Cincinnati","24","Tulsa","13"},
		{"Clemson","45","Louisville","10"},
		{"Eastern Michigan","34","Western Michigan","27"},
		{"Florida","38","South Carolina","27"},
		{"Florida International","32","Texas-El Paso","17"},
		{"Georgia","21","Kentucky","0"},
		{"Georgia Southern","30","Coastal Carolina","27"},
		{"Georgia State","28","Army","21"},
		{"Georgia Tech","28","Miami (FL)","21"},
		{"Houston","24","Connecticut","17"},
		{"Illinois","24","Wisconsin","23"},
		{"Indiana","34","Maryland","28"},
		{"Iowa","26","Purdue","20"},
		{"Iowa State","34","Texas Tech","24"},
		{"Kansas State","24","Texas Christian","17"},
		{"Liberty","59","Maine","44"},
		{"Louisiana State","36","Mississippi State","13"},
		{"Louisiana Tech","45","Southern Mississippi","30"},
		{"Marshall","36","Florida Atlantic","31"},
		{"Memphis","47","Tulane","17"},
		{"Miami (OH)","27","Northern Illinois","24"},
		{"Minnesota","42","Rutgers","7"},
		{"Navy","35","South Florida","3"},
		{"North Texas","33","Middle Tennessee State","30"},
		{"Ohio","45","Kent State","38"},
		{"Oklahoma","52","West Virginia","14"},
		{"Oregon","35","Washington","31"},
		{"Oregon State","21","California","17"},
		{"Penn State","28","Michigan","21"},
		{"San Diego State","27","San Jose State","17"},
		{"Southern California","41","Arizona","14"},
		{"Southern Methodist","45","Temple","21"},
		{"Texas","50","Kansas","48"},
		{"Texas A&M","24","Mississippi","17"},
		{"Texas-San Antonio","31","Rice","27"},
		{"Utah","21","Arizona State","3"},
		{"Utah State","36","Nevada","10"},
		{"Vanderbilt","21","Missouri","14"},
		{"Virginia","48","Duke","14"},
		{"Virginia Tech","43","North Carolina","41"},
		{"Wake Forest","22","Florida State","20"},
		{"Washington State","41","Colorado","10"},
		{"Western Kentucky","30","Charlotte","14"},
		{"Wyoming","23","New Mexico","10"},
		{"Southern Methodist","34","Houston","31"},
		{"Southern California","35","Colorado","31"},
		{"Air Force","31","Utah State","7"},
		{"Alabama","48","Arkansas","7"},
		{"Appalachian State","30","South Alabama","3"},
		{"Arkansas State","38","Texas State","14"},
		{"Buffalo","43","Central Michigan","20"},
		{"Central Florida","63","Temple","21"},
		{"Charlotte","39","North Texas","38"},
		{"Clemson","59","Boston College","7"},
		{"Colorado State","41","Fresno State","31"},
		{"Connecticut","56","Massachusetts","35"},
		{"Florida Atlantic","41","Old Dominion","3"},
		{"Florida State","35","Syracuse","17"},
		{"Georgia Southern","41","New Mexico State","7"},
		{"Georgia State","52","Troy","33"},
		{"Hawaii","45","New Mexico","31"},
		{"Illinois","24","Purdue","6"},
		{"Indiana","38","Nebraska","31"},
		{"Iowa","20","Northwestern","0"},
		{"Kansas","37","Texas Tech","34"},
		{"Kansas State","48","Oklahoma","41"},
		{"Kentucky","29","Missouri","7"},
		{"Louisiana State","23","Auburn","20"},
		{"Louisiana Tech","42","Texas-El Paso","21"},
		{"Louisville","28","Virginia","21"},
		{"Marshall","26","Western Kentucky","23"},
		{"Memphis","42","Tulsa","41"},
		{"Miami (FL)","16","Pittsburgh","12"},
		{"Miami (OH)","23","Kent State","16"},
		{"Michigan","45","Notre Dame","14"},
		{"Middle Tennessee State","50","Florida International","17"},
		{"Minnesota","52","Maryland","10"},
		{"Navy","41","Tulane","38"},
		{"North Carolina","20","Duke","17"},
		{"Northern Illinois","49","Akron","0"},
		{"Ohio","34","Ball State","21"},
		{"Ohio State","38","Wisconsin","7"},
		{"Oklahoma State","34","Iowa State","27"},
		{"Oregon","37","Washington State","35"},
		{"Penn State","28","Michigan State","7"},
		{"Rutgers","44","Liberty","34"},
		{"San Diego State","20","Nevada-Las Vegas","17"},
		{"San Jose State","34","Army","29"},
		{"South Florida","45","East Carolina","20"},
		{"Southern Mississippi","20","Rice","6"},
		{"Stanford","41","Arizona","31"},
		{"Tennessee","41","South Carolina","21"},
		{"Texas A&M","49","Mississippi State","30"},
		{"Texas Christian","37","Texas","27"},
		{"Toledo","37","Eastern Michigan","34"},
		{"UCLA","42","Arizona State","32"},
		{"Utah","35","California","0"},
		{"Western Michigan","49","Bowling Green State","10"},
		{"Wyoming","31","Nevada","3"},
		{"Baylor","17","West Virginia","14"},
		{"Georgia Southern","24","Appalachian State","21"},
		{"Navy","56","Connecticut","10"},
		{"Air Force","17","Army","13"},
		{"Arkansas State","48","Louisiana-Monroe","41"},
		{"Auburn","20","Mississippi","14"},
		{"Boise State","52","San Jose State","42"},
		{"Boston College","58","Syracuse","27"},
		{"Bowling Green State","35","Akron","6"},
		{"Brigham Young","42","Utah State","14"},
		{"Buffalo","43","Eastern Michigan","14"},
		{"Central Florida","44","Houston","29"},
		{"Central Michigan","48","Northern Illinois","10"},
		{"Charlotte","34","Middle Tennessee State","20"},
		{"Cincinnati","46","East Carolina","43"},
		{"Clemson","59","Wofford","14"},
		{"Coastal Carolina","36","Troy","35"},
		{"Colorado State","37","Nevada-Las Vegas","17"},
		{"Florida Atlantic","35","Western Kentucky","24"},
		{"Florida International","24","Old Dominion","17"},
		{"Fresno State","41","Hawaii","38"},
		{"Georgia","24","Florida","17"},
		{"Illinois","38","Rutgers","10"},
		{"Indiana","34","Northwestern","3"},
		{"Kansas State","38","Kansas","10"},
		{"Liberty","63","Massachusetts","21"},
		{"Louisiana","31","Texas State","3"},
		{"Marshall","20","Rice","7"},
		{"Memphis","54","Southern Methodist","48"},
		{"Miami (FL)","27","Florida State","10"},
		{"Michigan","38","Maryland","7"},
		{"Mississippi State","54","Arkansas","24"},
		{"Nevada","21","New Mexico","10"},
		{"North Texas","52","Texas-El Paso","26"},
		{"Notre Dame","21","Virginia Tech","20"},
		{"Oklahoma State","34","Texas Christian","27"},
		{"Oregon","56","Southern California","24"},
		{"Oregon State","56","Arizona","38"},
		{"Pittsburgh","20","Georgia Tech","10"},
		{"Purdue","31","Nebraska","27"},
		{"South Carolina","24","Vanderbilt","7"},
		{"Tennessee","30","Alabama-Birmingham","7"},
		{"Texas A&M","45","Texas-San Antonio","14"},
		{"Tulane","38","Tulsa","26"},
		{"UCLA","31","Colorado","14"},
		{"Utah","33","Washington","28"},
		{"Virginia","38","North Carolina","31"},
		{"Wake Forest","44","North Carolina State","10"},
		{"Toledo","35","Kent State","33"},
		{"Western Michigan","35","Ball State","31"},
		{"Miami (OH)","24","Ohio","21"},
		{"Louisiana","48","Coastal Carolina","7"},
		{"Temple","17","South Florida","7"},
		{"Tulsa","34","Central Florida","31"},
		{"Washington","19","Oregon State","7"},
		{"Appalachian State","20","South Carolina","15"},
		{"Army","63","Massachusetts","7"},
		{"Baylor","29","Texas Christian","23"},
		{"Boise State","20","Wyoming","17"},
		{"Brigham Young","31","Liberty","24"},
		{"California","33","Washington State","20"},
		{"Charlotte","28","Texas-El Paso","21"},
		{"Cincinnati","48","Connecticut","3"},
		{"Clemson","55","North Carolina State","10"},
		{"Colorado","16","Stanford","13"},
		{"Florida","56","Vanderbilt","0"},
		{"Florida Atlantic","37","Florida International","7"},
		{"Florida State","38","Boston College","31"},
		{"Georgia","27","Missouri","0"},
		{"Hawaii","42","San Jose State","40"},
		{"Illinois","37","Michigan State","34"},
		{"Louisiana State","46","Alabama","41"},
		{"Louisiana Tech","52","North Texas","17"},
		{"Louisiana-Monroe","45","Georgia State","31"},
		{"Miami (FL)","52","Louisville","27"},
		{"Minnesota","31","Penn State","26"},
		{"Mississippi","41","New Mexico State","3"},
		{"Nevada","17","San Diego State","13"},
		{"Notre Dame","38","Duke","7"},
		{"Ohio State","73","Maryland","14"},
		{"Oklahoma","42","Iowa State","41"},
		{"Purdue","24","Northwestern","22"},
		{"Southern California","31","Arizona State","26"},
		{"Southern Methodist","59","East Carolina","51"},
		{"Southern Mississippi","37","Alabama-Birmingham","2"},
		{"Tennessee","17","Kentucky","13"},
		{"Texas","27","Kansas State","24"},
		{"Texas State","30","South Alabama","28"},
		{"Texas Tech","38","West Virginia","17"},
		{"Texas-San Antonio","24","Old Dominion","23"},
		{"Troy","49","Georgia Southern","28"},
		{"Utah State","37","Fresno State","35"},
		{"Virginia","33","Georgia Tech","28"},
		{"Virginia Tech","36","Wake Forest","17"},
		{"Western Kentucky","45","Arkansas","19"},
		{"Wisconsin","24","Iowa","22"},
		{"Eastern Michigan","42","Akron","14"},
		{"Western Michigan","37","Ohio","34"},
		{"Miami (OH)","44","Bowling Green State","3"},
		{"Northern Illinois","31","Toledo","28"},
		{"Kent State","30","Buffalo","27"},
		{"Pittsburgh","34","North Carolina","27"},
		{"San Diego State","17","Fresno State","7"},
		{"Air Force","38","Colorado State","21"},
		{"Alabama","38","Mississippi State","7"},
		{"Alabama-Birmingham","37","Texas-El Paso","10"},
		{"Appalachian State","56","Georgia State","27"},
		{"Arkansas State","28","Coastal Carolina","27"},
		{"Army","47","Virginia Military Institute","6"},
		{"Boise State","42","New Mexico","9"},
		{"Brigham Young","42","Idaho State","10"},
		{"Central Michigan","45","Ball State","44"},
		{"Cincinnati","20","South Florida","17"},
		{"Clemson","52","Wake Forest","3"},
		{"Florida","23","Missouri","6"},
		{"Florida State","49","Alabama State","12"},
		{"Georgia","21","Auburn","14"},
		{"Georgia Southern","51","Louisiana-Monroe","29"},
		{"Hawaii","21","Nevada-Las Vegas","7"},
		{"Iowa","23","Minnesota","19"},
		{"Iowa State","23","Texas","21"},
		{"Kentucky","38","Vanderbilt","14"},
		{"Louisiana","37","South Alabama","27"},
		{"Louisiana State","58","Mississippi","37"},
		{"Louisville","34","North Carolina State","20"},
		{"Marshall","31","Louisiana Tech","10"},
		{"Memphis","45","Houston","27"},
		{"Michigan","44","Michigan State","10"},
		{"New Mexico State","41","Incarnate Word","28"},
		{"Northwestern","45","Massachusetts","6"},
		{"Notre Dame","52","Navy","20"},
		{"Ohio State","56","Rutgers","21"},
		{"Oklahoma","34","Baylor","31"},
		{"Oklahoma State","31","Kansas","13"},
		{"Oregon","34","Arizona","6"},
		{"Oregon State","35","Arizona State","34"},
		{"Penn State","34","Indiana","27"},
		{"Rice","31","Middle Tennessee State","28"},
		{"Southern California","41","California","17"},
		{"Southern Mississippi","36","Texas-San Antonio","17"},
		{"Syracuse","49","Duke","6"},
		{"Temple","29","Tulane","21"},
		{"Texas A&M","30","South Carolina","6"},
		{"Texas Christian","33","Texas Tech","31"},
		{"Troy","63","Texas State","27"},
		{"Utah","49","UCLA","3"},
		{"Utah State","26","Wyoming","21"},
		{"Virginia Tech","45","Georgia Tech","0"},
		{"Washington State","49","Stanford","22"},
		{"West Virginia","24","Kansas State","20"},
		{"Wisconsin","37","Nebraska","21"},
		{"Eastern Michigan","45","Northern Illinois","17"},
		{"Ohio","66","Bowling Green State","24"},
		{"Buffalo","49","Toledo","30"},
		{"Miami (OH)","20","Akron","17"},
		{"Georgia Tech","28","North Carolina State","26"},
		{"Wyoming","17","Colorado State","7"},
		{"Air Force","44","New Mexico","22"},
		{"Alabama","66","Western Carolina","3"},
		{"Alabama-Birmingham","20","Louisiana Tech","14"},
		{"Appalachian State","35","Texas State","13"},
		{"Arizona State","31","Oregon","28"},
		{"Arkansas State","38","Georgia Southern","33"},
		{"Auburn","52","Samford","0"},
		{"Baylor","24","Texas","10"},
		{"Boise State","56","Utah State","21"},
		{"Brigham Young","56","Massachusetts","24"},
		{"California","24","Stanford","20"},
		{"Central Florida","34","Tulane","31"},
		{"Charlotte","24","Marshall","13"},
		{"Cincinnati","15","Temple","13"},
		{"Colorado","20","Washington","14"},
		{"East Carolina","31","Connecticut","24"},
		{"Florida Atlantic","40","Texas-San Antonio","26"},
		{"Florida International","30","Miami (FL)","24"},
		{"Georgia","19","Texas A&M","13"},
		{"Georgia State","28","South Alabama","15"},
		{"Hawaii","14","San Diego State","11"},
		{"Houston","24","Tulsa","14"},
		{"Iowa","19","Illinois","10"},
		{"Iowa State","41","Kansas","31"},
		{"Kansas State","30","Texas Tech","27"},
		{"Kent State","41","Ball State","38"},
		{"Kentucky","50","Tennessee-Martin","7"},
		{"Louisiana","53","Troy","3"},
		{"Louisiana State","56","Arkansas","20"},
		{"Louisiana-Monroe","45","Coastal Carolina","42"},
		{"Louisville","56","Syracuse","34"},
		{"Memphis","49","South Florida","10"},
		{"Michigan","39","Indiana","14"},
		{"Michigan State","27","Rutgers","0"},
		{"Middle Tennessee State","38","Old Dominion","17"},
		{"Minnesota","38","Northwestern","22"},
		{"Mississippi State","45","Abilene Christian","7"},
		{"Navy","35","Southern Methodist","28"},
		{"Nebraska","54","Maryland","7"},
		{"Nevada","35","Fresno State","28"},
		{"Nevada-Las Vegas","38","San Jose State","35"},
		{"New Mexico State","44","Texas-El Paso","35"},
		{"North Carolina","56","Mercer","7"},
		{"Notre Dame","40","Boston College","7"},
		{"Ohio State","28","Penn State","17"},
		{"Oklahoma","28","Texas Christian","24"},
		{"Oklahoma State","20","West Virginia","13"},
		{"Rice","20","North Texas","14"},
		{"Southern California","52","UCLA","35"},
		{"Tennessee","24","Missouri","20"},
		{"Utah","35","Arizona","7"},
		{"Vanderbilt","38","East Tennessee State","0"},
		{"Virginia","55","Liberty","27"},
		{"Virginia Tech","28","Pittsburgh","0"},
		{"Wake Forest","39","Duke","27"},
		{"Washington State","54","Oregon State","53"},
		{"Western Kentucky","28","Southern Mississippi","10"},
		{"Wisconsin","45","Purdue","24"},
		{"Northern Illinois","17","Western Michigan","14"},
		{"Ohio","52","Akron","3"},
		{"Mississippi State","21","Mississippi","20"},
		{"Ball State","41","Miami (OH)","27"},
		{"Boise State","31","Colorado State","24"},
		{"Buffalo","49","Bowling Green State","7"},
		{"Central Florida","34","South Florida","7"},
		{"Central Michigan","49","Toledo","7"},
		{"Iowa","27","Nebraska","24"},
		{"Kent State","34","Eastern Michigan","26"},
		{"Memphis","34","Cincinnati","24"},
		{"Texas","49","Texas Tech","24"},
		{"Virginia","39","Virginia Tech","30"},
		{"Washington","31","Washington State","13"},
		{"West Virginia","20","Texas Christian","17"},
		{"Air Force","20","Wyoming","6"},
		{"Alabama-Birmingham","26","North Texas","21"},
		{"Appalachian State","48","Troy","13"},
		{"Arizona State","24","Arizona","14"},
		{"Auburn","48","Alabama","45"},
		{"Baylor","61","Kansas","6"},
		{"Boston College","26","Pittsburgh","19"},
		{"California","28","UCLA","18"},
		{"Charlotte","38","Old Dominion","22"},
		{"Clemson","38","South Carolina","3"},
		{"Coastal Carolina","24","Texas State","21"},
		{"Duke","27","Miami (FL)","17"},
		{"Florida","40","Florida State","17"},
		{"Florida Atlantic","34","Southern Mississippi","17"},
		{"Georgia","52","Georgia Tech","7"},
		{"Georgia Southern","38","Georgia State","10"},
		{"Hawaii","52","Army","31"},
		{"Indiana","44","Purdue","41"},
		{"Kansas State","27","Iowa State","17"},
		{"Kentucky","45","Louisville","13"},
		{"Liberty","49","New Mexico State","28"},
		{"Louisiana","31","Louisiana-Monroe","30"},
		{"Louisiana State","50","Texas A&M","7"},
		{"Louisiana Tech","41","Texas-San Antonio","27"},
		{"Marshall","30","Florida International","27"},
		{"Michigan State","19","Maryland","16"},
		{"Missouri","24","Arkansas","14"},
		{"Navy","56","Houston","41"},
		{"Nevada-Las Vegas","33","Nevada","30"},
		{"North Carolina","41","North Carolina State","10"},
		{"Northwestern","29","Illinois","10"},
		{"Notre Dame","45","Stanford","24"},
		{"Ohio State","56","Michigan","27"},
		{"Oklahoma","34","Oklahoma State","16"},
		{"Oregon","24","Oregon State","10"},
		{"Penn State","27","Rutgers","6"},
		{"Rice","30","Texas-El Paso","16"},
		{"San Diego State","13","Brigham Young","3"},
		{"San Jose State","17","Fresno State","16"},
		{"South Alabama","34","Arkansas State","30"},
		{"Southern Methodist","37","Tulane","20"},
		{"Syracuse","39","Wake Forest","30"},
		{"Temple","49","Connecticut","17"},
		{"Tennessee","28","Vanderbilt","10"},
		{"Tulsa","49","East Carolina","24"},
		{"Utah","45","Colorado","15"},
		{"Utah State","38","New Mexico","25"},
		{"Western Kentucky","31","Middle Tennessee State","26"},
		{"Wisconsin","38","Minnesota","17"},
		{"Oregon","37","Utah","15"},
		{"Appalachian State","45","Louisiana","38"},
		{"Boise State","31","Hawaii","10"},
		{"Clemson","62","Virginia","17"},
		{"Florida Atlantic","49","Alabama-Birmingham","6"},
		{"Louisiana State","37","Georgia","10"},
		{"Memphis","29","Cincinnati","24"},
		{"Miami (OH)","26","Central Michigan","21"},
		{"Ohio State","34","Wisconsin","21"},
		{"Oklahoma","30","Baylor","23"} };

		private static final String[] FCS = {
		"Texas Southern", "Western Carolina", "Austin Peay",
				"Nicholls State", "Southern Utah", "Indiana State", "Chattanooga",
				"Weber State", "Maine", "Tennessee-Martin", "Murray State",
				"Cal-San Luis Obispo", "Western Illinois", "Savannah State",
				"Lamar", "Sacramento State", "Eastern Washington",
				"Bethune-Cookman", "Samford", "Northwestern St(LA)",
				"Eastern Illinois", "Morgan State", "Idaho State", "Norfolk State",
				"New Hampshire", "Central Arkansas", "Jacksonville St",
				"Missouri State", "So Carolina State", "Alabama A+M",
				"North Dakota St", "Fordham", "Eastern Kentucky", "Florida A+M",
				"Virginia Military", "William + Mary", "Colgate", "Portland State",
				"South Dakota State", "Gardner-Webb", "Tennessee Tech",
				"South Dakota", "Montana State", "Stephen F Austin", "Villanova",
				"Illinois State", "James Madison", "Northern Iowa", "Elon",
				"Howard", "Youngstown State", "Grambling", "Furman", "Towson",
				"Charleston Southern", "Abilene Christian", "S E Missouri St",
				"S E Louisiana", "Southern Univ", "Prairie View",
				"Northern Colorado", "The Citadel", "Sam Houston State",
				"Alabama State", "Northern Arizona", "Southern Illinois",
				"Wofford", "Presbyterian", "Wagner", "Stony Brook", "Alcorn State",
				"McNeese State", "Jackson State", "Arkansas-Pine Bluff",
				"Richmond", "No Carolina Central", "Delaware", "UC-Davis",
				"North Dakota State", "Incarnate Word", "Rhode Island", "Monmouth",
				"Grambling State", "Southern", "North Dakota", "Cal Poly",
				"Delaware State", "Virginia Military Institute",
				"Stephen F. Austin", "Lafayette", "Prairie View A&M",
				"Northwestern State", "William & Mary", "Tennessee State",
				"Houston Baptist", "California-Davis", "Mississippi Valley State",
				"Florida A&M", "Citadel", "Hampton", "Southeast Missouri State",
				"Mercer", "Alabama A&M", "North Carolina Central",
				"Southeastern Louisiana", "Jacksonville State", "Albany",
				"North Carolina A&T", "South Carolina State", "Holy Cross",
				"Central Connecticut State", "Montana", "Idaho", "Lehigh", "Duquesne",
				"East Tennessee State", "Kennesaw State", "Campbell", "Southern Mississippi",
			  "Robert Morris", "Bucknell"};

		public static final Set<String> FCS_TEAMS = new HashSet<String>();

		static {
			for (String s : FCS) {
				FCS_TEAMS.add(s);
			}
		}

}
