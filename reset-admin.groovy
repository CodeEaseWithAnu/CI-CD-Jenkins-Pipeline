#!groovy

import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("newadmin","newpassword")
instance.setSecurityRealm(hudsonRealm)
instance.save()
