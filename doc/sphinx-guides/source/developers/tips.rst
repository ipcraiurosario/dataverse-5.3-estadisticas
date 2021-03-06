====
Tips
====

If you just followed the steps in :doc:`dev-environment` for the first time, you will need to get set up to deploy code to your app server. Below you'll find other tips as well.

.. contents:: |toctitle|
	:local:

Iterating on Code and Redeploying
---------------------------------

<<<<<<< HEAD
When you followed the steps in the :doc:`dev-environment` section, the war file was deployed to Payara by the Dataverse installation script. That's fine but once you're ready to make a change to the code you will need to get comfortable with undeploying and redeploying code (a war file) to Payara.

It's certainly possible to manage deployment and undeployment of the war file via the command line using the ``asadmin`` command that ships with Payara (that's what the Dataverse installation script uses and the steps are documented below), but we recommend getting set up with an IDE such as Netbeans to manage deployment for you.

Undeploy the war File from the Dataverse Installation Script
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Because the initial deployment of the war file was done outside of Netbeans by the Dataverse installation script, it's a good idea to undeploy that war file to give Netbeans a clean slate to work with.

Assuming you installed Payara in ``/usr/local/payara5``, run the following ``asadmin`` command to see the version of Dataverse that the Dataverse installation script deployed:
=======
When you followed the steps in the :doc:`dev-environment` section, the war file was deployed to Payara by the Dataverse Software installation script. That's fine but once you're ready to make a change to the code you will need to get comfortable with undeploying and redeploying code (a war file) to Payara.

It's certainly possible to manage deployment and undeployment of the war file via the command line using the ``asadmin`` command that ships with Payara (that's what the Dataverse Software installation script uses and the steps are documented below), but we recommend getting set up with an IDE such as Netbeans to manage deployment for you.

Undeploy the war File from the Dataverse Software Installation Script
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Because the initial deployment of the war file was done outside of Netbeans by the Dataverse Software installation script, it's a good idea to undeploy that war file to give Netbeans a clean slate to work with.

Assuming you installed Payara in ``/usr/local/payara5``, run the following ``asadmin`` command to see the version of the Dataverse Software that the Dataverse Software installation script deployed:
>>>>>>> dataverse-5.3/master

``/usr/local/payara5/bin/asadmin list-applications``

You will probably see something like ``dataverse-5.0 <ejb, web>`` as the output. To undeploy, use whichever version you see like this:

``/usr/local/payara5/bin/asadmin undeploy dataverse-5.0``

Now that Payara doesn't have anything deployed, we can proceed with getting Netbeans set up to deploy the code.

Add Payara as a Server in Netbeans
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Launch Netbeans and click "Tools" and then "Servers". Click "Add Server" and select "Payara Server" and set the installation location to ``/usr/local/payara5``. The defaults are fine so you can click "Next" and "Finish".

Please note that if you are on a Mac, Netbeans may be unable to start Payara due to proxy settings in Netbeans. Go to the "General" tab in Netbeans preferences and click "Test connection" to see if you are affected. If you get a green checkmark, you're all set. If you get a red exclamation mark, change "Proxy Settings" to "No Proxy" and retest. A more complicated answer having to do with changing network settings is available at https://discussions.apple.com/thread/7680039?answerId=30715103022#30715103022 and the bug is also described at https://netbeans.org/bugzilla/show_bug.cgi?id=268076

At this point you can manage Payara using Netbeans. Click "Window" and then "Services". Expand "Servers" and right-click Payara to stop and then start it so that it appears in the Output window. Note that you can expand "Payara" and "Applications" to see if any applications are deployed.

<<<<<<< HEAD
Ensure that Dataverse Will Be Deployed to Payara
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
=======
Ensure that the Dataverse Software Will Be Deployed to Payara
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
>>>>>>> dataverse-5.3/master

Click "Window" and then "Projects". Click "File" and then "Project Properties (dataverse)". Click "Run" and change "Server" from "No Server Selected" to your installation of Payara. Click OK.

.. _custom_build_num_script:

Make a Small Change to the Code
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Let's make a tiny change to the code, compile the war file, deploy it, and verify that that we can see the change.

One of the smallest changes we can make is adjusting the build number that appears in the lower right of every page.

From the root of the git repo, run the following command to set the build number to the word "hello" (or whatever you want):

``scripts/installer/custom-build-number hello``

This should update or place a file at ``src/main/java/BuildNumber.properties``.

Then, from Netbeans, click "Run" and then "Clean and Build Project (dataverse)". After this completes successfully, click "Run" and then "Run Project (dataverse)"

Confirm the Change Was Deployed
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

After deployment, check the build number in the lower right to make sure it has been customized. You can also check the build number by running the following command:

``curl http://localhost:8080/api/info/version``

If you can see the change, great! Please go fix a bug or work on a feature! :)

Actually, before you start changing any code, you should create a branch as explained in the :doc:`version-control` section.

While it's fresh in your mind, if you have any suggestions on how to make the setup of a development environment easier, please get in touch!

Netbeans Connector Chrome Extension
-----------------------------------

For faster iteration while working on JSF pages, it is highly recommended that you install the Netbeans Connector Chrome Extension listed in the :doc:`tools` section. When you save XHTML or CSS files, you will see the changes immediately. Hipsters call this "hot reloading". :)

Database Schema Exploration
---------------------------

<<<<<<< HEAD
With over 100 tables, the Dataverse PostgreSQL database ("dvndb") can be somewhat daunting for newcomers. Here are some tips for coming up to speed. (See also the :doc:`sql-upgrade-scripts` section.)
=======
With over 100 tables, the Dataverse Software PostgreSQL database ("dvndb") can be somewhat daunting for newcomers. Here are some tips for coming up to speed. (See also the :doc:`sql-upgrade-scripts` section.)
>>>>>>> dataverse-5.3/master

pgAdmin
~~~~~~~~

Back in the :doc:`dev-environment` section, we had you install pgAdmin, which can help you explore the tables and execute SQL commands. It's also listed in the :doc:`tools` section.

SchemaSpy
~~~~~~~~~

SchemaSpy is a tool that creates a website of entity-relationship diagrams based on your database.

As part of our build process for running integration tests against the latest code in the "develop" branch, we drop the database on the "phoenix" server, recreate the database by deploying the latest war file, and run SchemaSpy to create the following site: http://phoenix.dataverse.org/schemaspy/latest/relationships.html

To run this command on your laptop, download SchemaSpy and take a look at the syntax in ``scripts/deploy/phoenix.dataverse.org/post``

To read more about the phoenix server, see the :doc:`testing` section.

Deploying With ``asadmin``
--------------------------

Sometimes you want to deploy code without using Netbeans or from the command line on a server you have ssh'ed into.

For the ``asadmin`` commands below, we assume you have already changed directories to ``/usr/local/payara5/glassfish/bin`` or wherever you have installed Payara.

There are four steps to this process:

1. Build the war file: ``mvn package``
<<<<<<< HEAD
2. Check which version of Dataverse is deployed: ``./asadmin list-applications``
3. Undeploy the Dataverse application (if necessary): ``./asadmin undeploy dataverse-VERSION``
4. Copy the war file to the server (if necessary)
5. Deploy the new code: ``./asadmin deploy /path/to/dataverse-VERSION.war``

Running the Dataverse Installation Script in Non-Interactive Mode
-----------------------------------------------------------------
=======
2. Check which version of the Dataverse Software is deployed: ``./asadmin list-applications``
3. Undeploy the Dataverse Software (if necessary): ``./asadmin undeploy dataverse-VERSION``
4. Copy the war file to the server (if necessary)
5. Deploy the new code: ``./asadmin deploy /path/to/dataverse-VERSION.war``

Running the Dataverse Software Installation Script in Non-Interactive Mode
--------------------------------------------------------------------------
>>>>>>> dataverse-5.3/master

Rather than running the installer in "interactive" mode, it's possible to put the values in a file. See "non-interactive mode" in the :doc:`/installation/installation-main` section of the Installation Guide.

Preventing Payara from Phoning Home
-----------------------------------

By default, Glassfish reports analytics information. The administration guide suggests this can be disabled with ``./asadmin create-jvm-options -Dcom.sun.enterprise.tools.admingui.NO_NETWORK=true``, should this be found to be undesirable for development purposes. It is unknown if Payara phones home or not.

Solr
----

.. TODO: This section should be moved into a dedicated guide about Solr for developers. It should be extended with
<<<<<<< HEAD
         information about the way Solr is used within Dataverse, ideally explaining concepts and links to upstream docs.

Once some dataverses, datasets, and files have been created and indexed, you can experiment with searches directly from Solr at http://localhost:8983/solr/#/collection1/query and look at the JSON output of searches, such as this wildcard search: http://localhost:8983/solr/collection1/select?q=*%3A*&wt=json&indent=true . You can also get JSON output of static fields Solr knows about: http://localhost:8983/solr/collection1/schema/fields
=======
         information about the way Solr is used within the Dataverse Software, ideally explaining concepts and links to upstream docs.

Once some Dataverse collections, datasets, and files have been created and indexed, you can experiment with searches directly from Solr at http://localhost:8983/solr/#/collection1/query and look at the JSON output of searches, such as this wildcard search: http://localhost:8983/solr/collection1/select?q=*%3A*&wt=json&indent=true . You can also get JSON output of static fields Solr knows about: http://localhost:8983/solr/collection1/schema/fields
>>>>>>> dataverse-5.3/master

You can simply double-click "start.jar" rather that running ``java -jar start.jar`` from the command line. Figuring out how to stop Solr after double-clicking it is an exercise for the reader.

Git
---

Set Up SSH Keys
~~~~~~~~~~~~~~~

You can use git with passwords over HTTPS, but it's much nicer to set up SSH keys. https://github.com/settings/ssh is the place to manage the ssh keys GitHub knows about for you. That page also links to a nice howto: https://help.github.com/articles/generating-ssh-keys

From the terminal, ``ssh-keygen`` will create new ssh keys for you:

- private key: ``~/.ssh/id_rsa`` - It is very important to protect your private key. If someone else acquires it, they can access private repositories on GitHub and make commits as you! Ideally, you'll store your ssh keys on an encrypted volume and protect your private key with a password when prompted for one by ``ssh-keygen``. See also "Why do passphrases matter" at https://help.github.com/articles/generating-ssh-keys

- public key: ``~/.ssh/id_rsa.pub`` - After you've created your ssh keys, add the public key to your GitHub account.

Git on Mac
~~~~~~~~~~

On a Mac, you won't have git installed unless you have "Command Line Developer Tools" installed but running ``git clone`` for the first time will prompt you to install them.

Automation of Custom Build Number on Webpage
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

You can create symbolic links from ``.git/hooks/post-checkout`` and ``.git/hooks/post-commit`` to ``scripts/installer/custom-build-number-hook``
to let Git automatically update ``src/main/java/BuildNumber.properties`` for you. This will result in showing branch name and
commit id in your test deployment webpages on the bottom right corner next to the version.

When you prefer manual updates, there is another script, see above: :ref:`custom_build_num_script`.

Sample Data
-----------

<<<<<<< HEAD
You may want to populate your **non-production** installation(s) of Dataverse with sample data. You have a couple options:
=======
You may want to populate your **non-production** Dataverse installations with sample data. You have a couple options:
>>>>>>> dataverse-5.3/master

- Code in https://github.com/IQSS/dataverse-sample-data (recommended). This set of sample data includes several common data types, data subsetted from production datasets in dataverse.harvard.edu, datasets with file hierarchy, and more.
- Scripts called from ``scripts/deploy/phoenix.dataverse.org/post``.

Switching from Glassfish to Payara
----------------------------------

If you already have a working dev environment with Glassfish and want to switch to Payara, you must do the following:

- Copy the "domain1" directory from Glassfish to Payara.

----

Previous: :doc:`dev-environment` | Next: :doc:`troubleshooting`
