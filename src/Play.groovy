/**
 * Created by hyan on 5/11/16.
 */
class Play {
    def tiobeMay2016 = ["Java"        : 0.20956f,
               "C"                    : 0.13223f,
               "C++"                  : 0.06698f,
               "C#"                   : 0.04481f,
               "Python"               : 0.03789f,
               "PHP"                  : 0.02992f,
               "JavaScript"           : 0.02340f,
               "Ruby"                 : 0.02338f,
               "Perl"                 : 0.02326f,
               "Visual Basic .NET"    : 0.02325f,
               "Delphi/Object Pascal" : 0.02008f,
               "Assembly language"    : 0.01883f,
               "Visual Basic"         : 0.01828f,
               "Objective-C"          : 0.01597f,
               "Swift"                : 0.01593f,
               "R"                    : 0.01334f,
               "Groovy"               : 0.01288f,
               "MATLAB"               : 0.01287f,
               "PL/SQL"               : 0.01208f,
               "D"                    : 0.00975f]

    Play() {
        float otherV = 1.0
        tiobeMay2016.values().forEach{v -> otherV = otherV - v}
        tiobeMay2016.put("Other Language",  otherV)

        tiobeMay2016.each {e -> println("(" + e.key + "," + e.value + ")")}
    }
}
