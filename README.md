# Selenium Java Interview Sandbox

## 🚀 Quick Start

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#YOUR_REPO_URL)

## 📋 For Interviewers

1. Click the Gitpod button above
2. Wait 1-2 minutes for environment setup
3. Click on port 6080 to view browser
4. Run tests: `mvn test`
5. Share workspace with candidate

## 🎯 For Candidates

### Running Tests
```bash
mvn test
```

### View Browser
- Click on "Ports" tab in bottom panel
- Click "Open Browser" icon next to port 6080

### File Structure
```
src/test/java/InterviewTest.java - Your test file
```

## 📝 Sample Tasks

1. **Task 1**: Navigate to https://www.saucedemo.com and login
2. **Task 2**: Add item to cart and verify
3. **Task 3**: Handle alerts/popups
4. **Task 4**: Wait for elements (implicit/explicit)
5. **Task 5**: Take screenshot on failure

## 🔧 Troubleshooting

**Browser not visible?**
- Check port 6080 is open
- Click "Open Browser" next to port 6080

**Tests failing?**
- Check ChromeDriver is installed: `which chromedriver`
- Verify Chrome: `chromium-browser --version`
