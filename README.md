**Predictor is a utility used to calculate the crown width and root flare of trees based on research being done by [Eric North](mailto:eric.north@gmail.com).**

To use this tool maven is required, and a species.xml file.  This xml file holds the species definitions.  The path to the file should be set using the SPECIES\_FILE\_PATH environmental variable.  Example:

    export SPECIES_FILE_PATH=/tmp/species.xml
    
The species.xml file can be define based off of the following example:

    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <speciesList>
      <species>
        <name>maple</name>
        <rootFlareCalculation>(5.28*$dbh)^.0635</rootFlareCalculation>
        <crownWidthCalculation>(7.82^.096*$dbh)*12</crownWidthCalculation>
      </species>
    </speciesList>
    
To change the value of any text on the home page, edit the src/main/resources/messages_en.properties file.

Once the project is checked out, it can be run using the 'maven jetty:run' command, and be accessed via the following URL: *http://localhost:9090*