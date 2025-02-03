import { defineConfig, devices } from '@playwright/test';


export default defineConfig({
  testDir: './tests',
 
  reporter: 'html',
  use: {
    browserName : 'chromium',
    headless : false,
    screenshot: 'on',
    trace: 'retain-on-failure',
    ignoreHTTPSErrors: true, // Bypass HTTPS certificate errors
    permissions: ['microphone', 'camera'] ,
   
  },

 // timeout: 40000,

},

{
  "use": {
    "navigationTimeout": 90000  // Set navigation timeout to 20 seconds
  }
}


);
