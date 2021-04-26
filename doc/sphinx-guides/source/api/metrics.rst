Metrics API
===========

<<<<<<< HEAD
The Metrics API provides counts of downloads, datasets created, files uploaded, and more, as described below. Dataverse also supports Make Data Count, which is described in the :doc:`/admin/make-data-count` section of the Admin Guide.
=======
The Metrics API provides counts of downloads, datasets created, files uploaded, and more, as described below. The Dataverse Software also supports Make Data Count, which is described in the :doc:`/admin/make-data-count` section of the Admin Guide.
>>>>>>> dataverse-5.3/master

.. contents:: |toctitle|
    :local:

.. note:: |CORS| The Metrics API can be used from scripts running in web browsers, as it allows cross-origin resource sharing (CORS).

.. note:: For all metrics `besides` Past Days Count (``/pastDays/$days``), Database setting ``MetricsCacheTimeoutMinutes`` defines how long the cached value will be returned by subsequent queries.

.. _CORS: https://www.w3.org/TR/cors/

Total
-----

<<<<<<< HEAD
Returns a count of various objects in dataverse over all-time::
=======
Returns a count of various objects in a Dataverse installation over all-time::
>>>>>>> dataverse-5.3/master

    GET https://$SERVER/api/info/metrics/$type

``$type`` can be set to ``dataverses``, ``datasets``, ``files`` or ``downloads``.

Example: ``curl https://demo.dataverse.org/api/info/metrics/downloads``

To-Month
--------

<<<<<<< HEAD
Returns a count of various objects in dataverse up to a specified month ``$YYYY-DD`` in YYYY-MM format (e.g. ``2018-01``)::
=======
Returns a count of various objects in a Dataverse installation up to a specified month ``$YYYY-DD`` in YYYY-MM format (e.g. ``2018-01``)::
>>>>>>> dataverse-5.3/master

    GET https://$SERVER/api/info/metrics/$type/toMonth/$YYYY-DD

``$type`` can be set to ``dataverses``, ``datasets``, ``files`` or ``downloads``.

Example: ``curl https://demo.dataverse.org/api/info/metrics/dataverses/toMonth/2018-01``


Past Days
---------

<<<<<<< HEAD
Returns a count of various objects in dataverse for the past ``$days`` (e.g. ``30``):: 
=======
Returns a count of various objects in a Dataverse installation for the past ``$days`` (e.g. ``30``):: 
>>>>>>> dataverse-5.3/master

    GET https://$SERVER/api/info/metrics/$type/pastDays/$days

``$type`` can be set to ``dataverses``, ``datasets``, ``files`` or ``downloads``.

Example: ``curl https://demo.dataverse.org/api/info/metrics/datasets/pastDays/30``


<<<<<<< HEAD
Dataverse Specific Metrics
--------------------------
=======
Dataverse Collection Specific Metrics
-------------------------------------
>>>>>>> dataverse-5.3/master

By Subject
~~~~~~~~~~~~~~~

<<<<<<< HEAD
Returns the number of dataverses by each subject::
=======
Returns the number of Dataverse collections in a Dataverse installation by each subject::
>>>>>>> dataverse-5.3/master

    GET https://$SERVER/api/info/metrics/dataverses/bySubject


By Category
~~~~~~~~~~~~~~~~~~~~~~

<<<<<<< HEAD
Returns the number of dataverses by each category::
=======
Returns the number of Dataverse collections by each category::
>>>>>>> dataverse-5.3/master

    GET https://$SERVER/api/info/metrics/dataverses/byCategory


Dataset Specific Metrics
------------------------

By Subject
~~~~~~~~~~

Returns the number of datasets by each subject::

    GET https://$SERVER/api/info/metrics/datasets/bySubject


By Subject, and to Month
~~~~~~~~~~~~~~~~~~~~~~~~

Returns the number of datasets by each subject, and up to a specified month ``$YYYY-DD`` in YYYY-MM format (e.g. ``2018-01``)::

    GET https://$SERVER/api/info/metrics/datasets/bySubject/toMonth/$YYYY-DD

Example: ``curl https://demo.dataverse.org/api/info/metrics/datasets/bySubject/toMonth/2018-01``

.. |CORS| raw:: html

      <span class="label label-success pull-right">
        CORS
      </span>


Metric Query Parameters
-----------------------

To further tailor your metric, query parameters can be provided.

dataLocation
~~~~~~~~~~~~

Specifies whether the metric should query ``local`` data, ``remote`` data (e.g. harvested), or ``all`` data when getting results. Only works for dataset metrics.

Example: ``curl https://demo.dataverse.org/api/info/metrics/datasets/?dataLocation=remote``
