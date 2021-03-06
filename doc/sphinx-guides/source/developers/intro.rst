============
Introduction
============

<<<<<<< HEAD
Welcome! `Dataverse <http://dataverse.org>`_ is an `open source <https://github.com/IQSS/dataverse/blob/master/LICENSE.md>`_ project that loves `contributors <https://github.com/IQSS/dataverse/blob/develop/CONTRIBUTING.md>`_!
=======
Welcome! `The Dataverse Project <http://dataverse.org>`_ is an `open source <https://github.com/IQSS/dataverse/blob/master/LICENSE.md>`_ project that loves `contributors <https://github.com/IQSS/dataverse/blob/develop/CONTRIBUTING.md>`_!
>>>>>>> dataverse-5.3/master

.. contents:: |toctitle|
	:local:

Intended Audience
-----------------

<<<<<<< HEAD
This guide is intended primarily for developers who want to work on the main Dataverse code base at https://github.com/IQSS/dataverse but see "Related Projects" below for other code you can work on!
=======
This guide is intended primarily for developers who want to work on the main Dataverse Software code base at https://github.com/IQSS/dataverse but see "Related Projects" below for other code you can work on!
>>>>>>> dataverse-5.3/master

To get started, you'll want to set up your :doc:`dev-environment` and make sure you understand the branching strategy described in the :doc:`version-control` section and how to make a pull request. :doc:`testing` is expected. Opinions about :doc:`coding-style` are welcome!

.. _getting-help-developers:

Getting Help
------------

If you have any questions at all, please reach out to other developers via the channels listed in https://github.com/IQSS/dataverse/blob/develop/CONTRIBUTING.md such as http://chat.dataverse.org (#dataverse on freenode), the `dataverse-dev <https://groups.google.com/forum/#!forum/dataverse-dev>`_ mailing list, `community calls <https://dataverse.org/community-calls>`_, or support@dataverse.org.

Core Technologies
-----------------

<<<<<<< HEAD
Dataverse is a `Jakarta EE <https://en.wikipedia.org/wiki/Jakarta_EE>`_ application that is compiled into a WAR file and deployed to an application server (app server) which is configured to work with a relational database (PostgreSQL) and a search engine (Solr).
=======
The Dataverse Software is a `Jakarta EE <https://en.wikipedia.org/wiki/Jakarta_EE>`_ application that is compiled into a WAR file and deployed to an application server (app server) which is configured to work with a relational database (PostgreSQL) and a search engine (Solr).
>>>>>>> dataverse-5.3/master

We make use of a variety of Jakarta EE technologies such as JPA, JAX-RS, JMS, and JSF. The front end is built using PrimeFaces and Bootstrap.

In addition, we start to adopt parts of Eclipse MicroProfile, namely `MicroProfile Config <https://github.com/eclipse/microprofile-config>`_.

Roadmap
-------

<<<<<<< HEAD
For the Dataverse development roadmap, please see https://www.iq.harvard.edu/roadmap-dataverse-project
=======
For the Dataverse Software development roadmap, please see https://www.iq.harvard.edu/roadmap-dataverse-project
>>>>>>> dataverse-5.3/master

Kanban Board
------------

You can get a sense of what's currently in flight (in dev, in QA, etc.) by looking at https://github.com/orgs/IQSS/projects/2

Issue Tracker
-------------

We use GitHub Issues as our issue tracker: https://github.com/IQSS/dataverse/issues

Related Guides
--------------

<<<<<<< HEAD
If you are a developer who wants to make use of Dataverse APIs, please see the :doc:`/api/index`. If you have front-end UI questions, please see the :doc:`/style/index`.
=======
If you are a developer who wants to make use of the Dataverse Software APIs, please see the :doc:`/api/index`. If you have front-end UI questions, please see the :doc:`/style/index`.
>>>>>>> dataverse-5.3/master

If you are a sysadmin who likes to code, you may be interested in hacking on installation scripts mentioned in the :doc:`/installation/index`. We validate the installation scripts with :doc:`/developers/tools` such as `Vagrant <http://vagrantup.com>`_ and Docker (see the :doc:`containers` section).

Related Projects
----------------

As a developer, you also may be interested in these projects related to Dataverse:

<<<<<<< HEAD
- External Tools - add additional features to Dataverse without modifying the core: :doc:`/api/external-tools`
- Dataverse API client libraries - use Dataverse APIs from various languages: :doc:`/api/client-libraries`
- DVUploader - a stand-alone command-line Java application that uses the Dataverse API to support upload of files from local disk to a Dataset: https://github.com/IQSS/dataverse-uploader 
- dataverse-sample-data - populate your Dataverse installation with sample data: https://github.com/IQSS/dataverse-sample-data
- dataverse-metrics - aggregate and visualize metrics for installations of Dataverse around the world: https://github.com/IQSS/dataverse-metrics
- Configuration management scripts - Ansible, Puppet, etc.: See :ref:`advanced` section in the Installation Guide.
- :doc:`/developers/unf/index` (Java) -  a Universal Numerical Fingerprint: https://github.com/IQSS/UNF
- GeoConnect (Python) - create a map by uploading files to Dataverse: https://github.com/IQSS/geoconnect
- `DataTags <https://github.com/IQSS/DataTags>`_ (Java and Scala) - tag datasets with privacy levels: https://github.com/IQSS/DataTags
- `TwoRavens <http://2ra.vn>`_ (Javascript) - a `d3.js <http://d3js.org>`_ interface for exploring data and running Zelig models: https://github.com/IQSS/TwoRavens
- `Zelig <http://zeligproject.org>`_ (R) - run statistical models on files uploaded to Dataverse: https://github.com/IQSS/Zelig
- `Matrix <https://github.com/rindataverse/matrix>`_ - a visualization showing the connectedness and collaboration between authors and their affiliations.
- Third party apps - make use of Dataverse APIs: :doc:`/api/apps`
- chat.dataverse.org - chat interface for Dataverse users and developers: https://github.com/IQSS/chat.dataverse.org
=======
- External Tools - add additional features to the Dataverse Software without modifying the core: :doc:`/api/external-tools`
- Dataverse Software API client libraries - use Dataverse Software APIs from various languages: :doc:`/api/client-libraries`
- DVUploader - a stand-alone command-line Java application that uses the Dataverse Software API to support upload of files from local disk to a Dataset: https://github.com/IQSS/dataverse-uploader 
- dataverse-sample-data - populate your Dataverse installation with sample data: https://github.com/IQSS/dataverse-sample-data
- dataverse-metrics - aggregate and visualize metrics for Dataverse installations around the world: https://github.com/IQSS/dataverse-metrics
- Configuration management scripts - Ansible, Puppet, etc.: See :ref:`advanced` section in the Installation Guide.
- :doc:`/developers/unf/index` (Java) -  a Universal Numerical Fingerprint: https://github.com/IQSS/UNF
- `DataTags <https://github.com/IQSS/DataTags>`_ (Java and Scala) - tag datasets with privacy levels: https://github.com/IQSS/DataTags
- `TwoRavens <http://2ra.vn>`_ (Javascript) - a `d3.js <http://d3js.org>`_ interface for exploring data and running Zelig models: https://github.com/IQSS/TwoRavens
- `Zelig <http://zeligproject.org>`_ (R) - run statistical models on files uploaded to a Dataverse installation: https://github.com/IQSS/Zelig
- `Matrix <https://github.com/rindataverse/matrix>`_ - a visualization showing the connectedness and collaboration between authors and their affiliations.
- Third party apps - make use of Dataverse installation APIs: :doc:`/api/apps`
- chat.dataverse.org - chat interface for Dataverse Project users and developers: https://github.com/IQSS/chat.dataverse.org
>>>>>>> dataverse-5.3/master
- [Your project here] :)

----

Next: :doc:`dev-environment`
