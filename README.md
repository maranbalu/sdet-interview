# Selenium Java Interview Sandbox

## 🚀 Quick Start

### **Option 1: Replit (Recommended - Simple & Fast)**
[![Run on Replit](https://replit.com/badge/github/maranbalu/sdet-interview)](https://replit.com/new/github/maranbalu/sdet-interview)

**Steps:**
1. Click the Replit badge above
2. Wait for setup (~30 seconds)
3. Click "Run" button
4. Tests execute in headless mode automatically!

### **Option 2: Gitpod (Advanced - VNC Browser View)**
[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/maranbalu/sdet-interview)

## 📋 For Interviewers

### **Using Replit (Easiest):**
1. Click "Run on Replit" badge
2. Click "Run" button (runs `mvn clean test`)
3. Share Replit workspace with candidate
4. Candidate can edit tests and click "Run"

### **Using Gitpod (With Browser View):**
1. Click "Open in Gitpod" button
2. Wait 1-2 minutes for environment setup
3. Click on port 6080 to view browser (VNC)
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
