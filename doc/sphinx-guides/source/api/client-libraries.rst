Client Libraries
================

<<<<<<< HEAD
Currently there are client libraries for Python, Javascript, R, and Java that can be used to develop against Dataverse APIs. We use the term "client library" on this page but "Dataverse SDK" (software development kit) is another way of describing these resources. They are designed to help developers express Dataverse concepts more easily in the languages listed below. For support on any of these client libraries, please consult each project's README.

Because Dataverse is a SWORD server, additional client libraries exist for Java, Ruby, and PHP per the :doc:`/api/sword` page.
=======
Currently there are client libraries for Python, Javascript, R, and Java that can be used to develop against Dataverse Software APIs. We use the term "client library" on this page but "Dataverse Software SDK" (software development kit) is another way of describing these resources. They are designed to help developers express Dataverse Software concepts more easily in the languages listed below. For support on any of these client libraries, please consult each project's README.

Because a Dataverse installation is a SWORD server, additional client libraries exist for Java, Ruby, and PHP per the :doc:`/api/sword` page.
>>>>>>> dataverse-5.3/master

.. contents:: |toctitle|
	:local:

Python
------

<<<<<<< HEAD
There are two Python modules for interacting with Dataverse APIs.

`pyDataverse <https://github.com/AUSSDA/pyDataverse>`_ had its initial release in 2019 and can be installed with ``pip install pyDataverse``. The module is developed by `Stefan Kasberger <http://stefankasberger.at>`_ from `AUSSDA - The Austrian Social Science Data Archive <https://aussda.at>`_.  

`dataverse-client-python <https://github.com/IQSS/dataverse-client-python>`_ had its initial release in 2015. `Robert Liebowitz <https://github.com/rliebz>`_ created this library while at the `Center for Open Science (COS) <https://centerforopenscience.org>`_ and the COS uses it to integrate the `Open Science Framework (OSF) <https://osf.io>`_ with Dataverse via an add-on which itself is open source and listed on the :doc:`/api/apps` page.
=======
There are two Python modules for interacting with Dataverse Software APIs.

`pyDataverse <https://github.com/gdcc/pyDataverse>`_ primarily allows developers to manage Dataverse collections, datasets and datafiles. Its intention is to help with data migrations and DevOps activities such as testing and configuration management. The module is developed by `Stefan Kasberger <http://stefankasberger.at>`_ from `AUSSDA - The Austrian Social Science Data Archive <https://aussda.at>`_.  

`dataverse-client-python <https://github.com/IQSS/dataverse-client-python>`_ had its initial release in 2015. `Robert Liebowitz <https://github.com/rliebz>`_ created this library while at the `Center for Open Science (COS) <https://centerforopenscience.org>`_ and the COS uses it to integrate the `Open Science Framework (OSF) <https://osf.io>`_ with a Dataverse installation via an add-on which itself is open source and listed on the :doc:`/api/apps` page.
>>>>>>> dataverse-5.3/master

Javascript
----------

<<<<<<< HEAD
https://github.com/IQSS/dataverse-client-javascript is the official Javascript package for Dataverse APIs. It can be found on npm at https://www.npmjs.com/package/js-dataverse
=======
https://github.com/IQSS/dataverse-client-javascript is the official Javascript package for Dataverse Software APIs. It can be found on npm at https://www.npmjs.com/package/js-dataverse
>>>>>>> dataverse-5.3/master

It was created and is maintained by `The Agile Monkeys <https://www.theagilemonkeys.com>`_.

R
-

<<<<<<< HEAD
https://github.com/IQSS/dataverse-client-r is the official R package for Dataverse APIs. The latest release can be installed from `CRAN <https://cran.r-project.org/package=dataverse>`_.

The package is currently maintained by `Will Beasley <https://github.com/wibeasley>`_. It was created by `Thomas Leeper <http://thomasleeper.com>`_ whose dataverse can be found at https://dataverse.harvard.edu/dataverse/leeper
=======
https://github.com/IQSS/dataverse-client-r is the official R package for Dataverse Software APIs. The latest release can be installed from `CRAN <https://cran.r-project.org/package=dataverse>`_.

The package is currently maintained by `Will Beasley <https://github.com/wibeasley>`_. It was created by `Thomas Leeper <http://thomasleeper.com>`_ whose Dataverse collection can be found at https://dataverse.harvard.edu/dataverse/leeper
>>>>>>> dataverse-5.3/master

Java
----

<<<<<<< HEAD
https://github.com/IQSS/dataverse-client-java is the official Java library for Dataverse APIs.

`Richard Adams <http://www.researchspace.com/electronic-lab-notebook/about_us_team.html>`_ from `ResearchSpace <http://www.researchspace.com>`_ created and maintains this library.
=======
https://github.com/IQSS/dataverse-client-java is the official Java library for Dataverse Software APIs.

`Richard Adams <http://www.researchspace.com/electronic-lab-notebook/about_us_team.html>`_ from `ResearchSpace <http://www.researchspace.com>`_ created and maintains this library.

Ruby
----

https://github.com/libis/dataverse_api is a Ruby gem for Dataverse Software APIs. It is registered as a library on Rubygems (https://rubygems.org/search?query=dataverse).

The gem is created and maintained by the LIBIS team (https://www.libis.be) at the University of Leuven (https://www.kuleuven.be).
>>>>>>> dataverse-5.3/master
