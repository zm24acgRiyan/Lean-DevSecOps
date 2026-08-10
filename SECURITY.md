# Security Policy

## Supported Version

This repository is an academic and portfolio DevSecOps project. Security updates are applied to the latest version available on the `main` branch.

## Reporting a Vulnerability

Please do not open a public GitHub issue for security vulnerabilities.

If you discover a security issue, contact the repository maintainer privately:

**Riyan Ahmed**

- GitHub: https://github.com/riyan-ahmed
- LinkedIn: https://www.linkedin.com/in/riyan-ahmed-devops

Please include:

- A description of the vulnerability
- Steps to reproduce it
- The affected component
- Potential impact
- Suggested remediation, if known

## Security Controls

This project uses automated security checks including:

- SonarCloud for static analysis
- Snyk for dependency vulnerability scanning
- Trivy for container image scanning
- GitHub Code Scanning for SARIF-based reporting
- Security gates that block high and critical findings
- Dependabot for dependency maintenance
- Pinned GitHub Actions to reduce CI/CD supply-chain risk
