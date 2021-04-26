Managing Harvesting Server and Sets
===================================

.. contents:: |toctitle|
  :local:

<<<<<<< HEAD
Your Dataverse as an OAI server
-------------------------------

As a harvesting *server*, your Dataverse can make some of the local
dataset metadata available to remote harvesting clients. These can be
other Dataverse instances, or any other clients that support OAI-PMH
=======
Your Dataverse Installation as an OAI server
--------------------------------------------

As a harvesting *server*, your Dataverse installation can make some of the local dataset metadata available to remote harvesting clients. These can be
other Dataverse installations, or any other clients that support OAI-PMH
>>>>>>> dataverse-5.3/master
harvesting protocol. Note that the terms "Harvesting Server" and "OAI
Server" are being used interchangeably throughout this guide and in
the inline help text.

If you want to learn more about OAI-PMH, you could take a look at
`DataCite OAI-PMH guide <https://support.datacite.org/docs/datacite-oai-pmh>`_
or the `OAI-PMH protocol definition <https://www.openarchives.org/OAI/openarchivesprotocol.html>`_.

<<<<<<< HEAD
You might consider adding your OAI-enabled production instance of Dataverse to
=======
You might consider adding your OAI-enabled Dataverse installation to
>>>>>>> dataverse-5.3/master
`this shared list <https://docs.google.com/spreadsheets/d/12cxymvXCqP_kCsLKXQD32go79HBWZ1vU_tdG4kvP5S8/>`_
of such instances.

The email portion of :ref:`systemEmail` will be visible via OAI-PMH (from the "Identify" verb).

How does it work? 
-----------------

<<<<<<< HEAD
Only the published, unrestricted datasets in your Dataverse can
=======
Only the published, unrestricted datasets in your Dataverse installation can
>>>>>>> dataverse-5.3/master
be made harvestable. Remote clients normally keep their records in sync
through scheduled incremental updates, daily or weekly, thus
minimizing the load on your server. Note that it is only the metadata
that are harvested. Remote harvesters will generally not attempt to
download the data files associated with the harvested datasets.

Harvesting server can be enabled or disabled on the "Harvesting
Server" page accessible via the :doc:`dashboard`. Harvesting server is by
<<<<<<< HEAD
default disabled on a brand new, "out of the box" Dataverse.

The OAI-PMH endpoint can be accessed at ``http(s)://<Your Dataverse FQDN>/oai``.
=======
default disabled on a brand new, "out of the box" Dataverse installation.

The OAI-PMH endpoint can be accessed at ``http(s)://<Your Dataverse Installation FQDN>/oai``.
>>>>>>> dataverse-5.3/master
If you want other services to harvest your repository, point them to this URL.
*Example URL for 'Identify' verb*: `demo.dataverse.org OAI <https://demo.dataverse.org/oai?verb=Identify>`_

OAI Sets
--------

Once the service is enabled, you define collections of local datasets
that will be available to remote harvesters as *OAI Sets*. Once again,
the terms "OAI Set" and "Harvesting Set" are used
interchangeably. Sets are defined by search queries. Any such query
that finds any number of published, local (non-harvested) datasets can
<<<<<<< HEAD
be used to create an OAI set. Sets can overlap local dataverses, and
can include as few or as many of your local datasets as you wish. A
good way to master the Dataverse search query language is to
=======
be used to create an OAI set. Sets can overlap local Dataverse collections, and can include as few or as many of your local datasets as you wish. A
good way to master the Dataverse Software search query language is to
>>>>>>> dataverse-5.3/master
experiment with the Advanced Search page. We also recommend that you
consult the :doc:`/api/search` section of the API Guide. 

Once you have entered the search query and clicked *Next*, the number
of search results found will be shown on the next screen. This way, if
you are seeing a number that's different from what you expected, you
can go back and try to re-define the query.

Some useful examples of search queries to define OAI sets: 

<<<<<<< HEAD
- A good way to create a set that would include all your local, published datasets is to do so by the Unique Identifier authority registered to your Dataverse, for example: 
=======
- A good way to create a set that would include all your local, published datasets is to do so by the Unique Identifier authority registered to your Dataverse installation, for example: 
>>>>>>> dataverse-5.3/master

  ``dsPersistentId:"doi:1234/"``

  Note that double quotes must be used, since the search field value contains the colon symbol!
  
  Note also that the search terms limiting the results to published and local datasets **are added to the query automatically**, so you don't need to worry about that. 
  
<<<<<<< HEAD
- A query to create a set to include the datasets from a specific local dataverse: 

  ``parentId:NNN``

  where NNN is the database id of the dataverse object (consult the Dataverse table of the SQL database used by the application to verify the database id). 
=======
- A query to create a set to include the datasets from a specific Dataverse collection: 

  ``parentId:NNN``

  where NNN is the database id of the Dataverse collection object (consult the Dataverse table of the SQL database used by the application to verify the database id).
  
  Note that this query does **not** provide datasets that are linked into the specified Dataverse collection.

- A query to create a set to include the datasets from a specific Dataverse collection including datasets that have been deposited into other Dataverse collections but linked into the specified Dataverse collection: 

  ``subtreePaths:"/NNN"``

  where NNN is the database id of the Dataverse collection object (consult the Dataverse table of the SQL database used by the application to verify the database id). 
>>>>>>> dataverse-5.3/master

- A query to find all the dataset by a certain author: 

  ``authorName:YYY``

  where YYY is the name. 

- Complex queries can be created with multiple logical AND and OR operators. For example, 

  ``(authorName:YYY OR authorName:ZZZ) AND dsPublicationDate:NNNN``
  
- Some further query examples: 

  For specific datasets using a persistentID:
  
  ``(dsPersistentId:10.5000/ZZYYXX/ OR dsPersistentId:10.5000/XXYYZZ)``

  For all datasets within a specific ID authority:
  
  ``dsPersistentId:10.5000/XXYYZZ``

<<<<<<< HEAD
  For all dataverses with subjects of Astronomy and Astrophysics or Earth and Environmental Sciences:
=======
  For all Dataverse collections with subjects of Astronomy and Astrophysics or Earth and Environmental Sciences:
>>>>>>> dataverse-5.3/master
 
  ``(dvSubject:"Astronomy and Astrophysics" OR dvSubject:"Earth and Environmental Sciences")``

  For all datasets containing the keyword "censorship":

  ``keywordValue:censorship``

Important: New SOLR schema required!
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

<<<<<<< HEAD
In order to be able to define OAI sets, your SOLR server must be upgraded with the search schema that came with the Dataverse release 4.5 (or later), and all your local datasets must be re-indexed, once the new schema is installed. 
=======
In order to be able to define OAI sets, your SOLR server must be upgraded with the search schema that came with release 4.5 (or later), and all your local datasets must be re-indexed, once the new schema is installed. 
>>>>>>> dataverse-5.3/master

OAI Set updates
---------------

Every time a new harvesting set is created, or changes are made to an
existing set, the contents of the set are automatically updated - the
<<<<<<< HEAD
Dataverse application will find the datasets defined by the query, and
=======
Dataverse installation will find the datasets defined by the query, and
>>>>>>> dataverse-5.3/master
attempt to run the metadata export on the ones that haven't been
exported yet. Only the datasets for which the export has completed
successfully, and the results cached on the filesystem are included in
the OAI sets advertised to the harvesting clients!

This is in contrast to how the sets used to be managed in DVN v.3,
where sets had to be exported manually before any such changes had
effect.

**Important:** Note however that changes made to the actual dataset
metadata do not automatically trigger any corresponding OAI sets to
be updated immediately! For example: let's say you have created an OAI set defined by
the search query ``authorName:king``, that resulted in 43
dataset records. If a new dataset by the same author is added and published, this **does not** immediately add the extra
record to the set! It would simply be too expensive, to refresh all
the sets every time any changes to the metadata are made. 

The OAI set will however be updated automatically by a scheduled metadata export job that
runs every night (at 2AM, by default). This export timer is created
and activated automatically every time the application is deployed
<<<<<<< HEAD
or restarted. Once again, this is new in Dataverse 4, and unlike DVN
v3, where export jobs had to be scheduled and activated by the admin
user. See the :doc:`/admin/metadataexport` section of the Admin Guide, for more information on the automated metadata exports.
=======
or restarted. See the :doc:`/admin/metadataexport` section of the Admin Guide, for more information on the automated metadata exports.
>>>>>>> dataverse-5.3/master

It is still possible however to make changes like this be immediately
reflected in the OAI server, by going to the *Harvesting Server* page
and clicking the "Run Export" icon next to the desired OAI set.
