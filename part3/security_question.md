 what would you look for to make your system secure?

For all I would use the recomendations of owasp.org

Broken access control:
    I would create users roles to control the access, put the allowed user rol in the services or methods to avoid bypassing
Cryptographic Failures
    Classify data, don't store sensitive data if is not necessary, apply encryption.
Injection
    Use safe API, maybe use control for special characters in front-end, positive server-side input validation
Insecure design
    Establish secure development lifecycle, using secure design paters, Segregate tier layer, limit resource consumption by user
Security Misconfiguration
    Keep the software up to date, use a secure configuration checklist
Vulnerable and Outdated Components
    Keep software up to date client and server, remove unused features, get components from secure links
Identification and Authentication Failures
    implement multi-factor authentication, only allow secure passwords with NIST
Software and Data Integrity Failures
    Consume trusted repositories, Use digital signatures
Security Logging and Monitoring Failures
    ensure logs are generated that they can be easily consume, establish effective monitoring and alert to suspicious activities
Server-Side Request Forgery (SSRF)
    Validate the input data, add a positive URL allow list