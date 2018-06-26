PathwayMatcher
======

[![GitHub license](http://dmlc.github.io/img/apache2.svg)](https://github.com/LuisFranciscoHS/PathwayMatcher/blob/master/LICENSE.txt)


## Overview

PathwayMatcher is a standalone command line tool to match human biomedical data to pathways. Its advanced mapping functions allow matching multiple types of omics data to the [Reactome](http://www.reactome.org/) database: lists of genetic variants, gene or protein identifiers, lists of peptides including post-translational modifications, and proteoforms. For example, if a protein is provided with a phosphorylation at a given site, it is possible to match only those pathways involving the protein in the given phosphorylation state. PathayMatcher then exports the reactions and pathways matched, standard overrepresentation analysis, and biological networks.  

*See our [Wiki](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki) for more information.*

## Bioconda

[![install with bioconda](https://anaconda.org/bioconda/pathwaymatcher/badges/installer/conda.svg)](http://bioconda.github.io/recipes/pathwaymatcher/README.html)
[![bioconda downloads](https://anaconda.org/bioconda/pathwaymatcher/badges/downloads.svg)](http://bioconda.github.io/recipes/pathwaymatcher/README.html)
[![latest release](https://anaconda.org/bioconda/pathwaymatcher/badges/latest_release_date.svg)](http://bioconda.github.io/recipes/pathwaymatcher/README.html)

PathwayMatcher is available in [Bioconda](bioconda.github.io/recipes/pathwaymatcher/README.html). Install with:

```bash
conda install pathwaymatcher
```

and update with:

```bash
conda update pathwaymatcher
```


## Installation

1. Install java 
1. Download PathwayMatcher executable.
1. Run PathwayMatcher.

*See our [Wiki](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Installation) for more information.*

## Usage

PathwayMatcher can search for reactions and pathways with various input types, and generates mapping files to the database.

*See our [Wiki](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Usage) for more information.*

#### Input:

The input can be:
* [Genetic variants](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input#genetic-variants)
* [Genes](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input#genes)
* [Peptides](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input#peptides)
* [Protein](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input#proteins)
* [Proteoforms](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input#proteoforms)

*See our [Wiki](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Input) for more information.*

#### Output:

The output of PathwayMatcher is composed of three files, the [Reaction and Pathway mapping](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Output#search), the [statistical analysis](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Output#analysis) of the relevant pathways, and biological networks constructed based on the input.

*See our [Wiki](https://github.com/LuisFranciscoHS/PathwayMatcher/wiki/Output) for more information.*

## Licence

PathwayMatcher is a free open-source project, distributed under the permisive [Apache License 2.0](https://github.com/LuisFranciscoHS/PathwaySearch/blob/master/LICENSE.txt "Apache Licence"). 

## Acknowledgements

* [KG Jebsen Center for Diabetes Research](http://www.uib.no/en/diabetes "KG Jebsen Center for Diabetes Research Homepage")
* [University of Bergen (UiB)](http://www.uib.no/en "UiB's Homepage")
* [EMBL-EBI](http://www.ebi.ac.uk/ "EBI's Homepage")
