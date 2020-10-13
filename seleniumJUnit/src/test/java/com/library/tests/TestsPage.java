package com.library.tests;


import com.library.pages.*;
import com.library.pages.LoginSuccessPage;
import com.library.utilities.BrowserUtils;
import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;
import java.util.List;

public class TestsPage extends AbstractTestBase {
    LoginSuccessPage logInSuccess = new LoginSuccessPage();
    CheckboxesPage checkboxesPage = new CheckboxesPage();
    ContextMenuPage contextMenuPage = new ContextMenuPage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    DropdownPage dropdownPage = new DropdownPage();
    DynamicContentPage dynamicContentPage = new DynamicContentPage();
    DynamicControlsPages dynamicControlsPages = new DynamicControlsPages();
    DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
    FileDownloadPage fileDownloadPage = new FileDownloadPage();
    FileUploadPage fileUploadPage = new FileUploadPage();
    FloatingMenuPage floatingMenuPage = new FloatingMenuPage();
    IframePage iframePage = new IframePage();
    MouseHoverPage mouseHoverPage = new MouseHoverPage();
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();
    JavaScriptErrorPage javaScriptErrorPage = new JavaScriptErrorPage();
    OpenInNewTabPage openInNewTabPage = new OpenInNewTabPage();
    NotificationMessagePage notificationMessagePage = new NotificationMessagePage();


    @Test
    public void LoginSuccess() {
        logInSuccess.LogIn();
    }

    @Test
    public void LoginSuccessWrongCredentials() {
        logInSuccess.LogIn("BlaBla", "LaLA");

    }
/*
Test checks and unchecks checkboxes.
Test uses assertions to make sure boxes were properly checked and unchecked.
 */
    @Test
    public void Checkboxes() {
        checkboxesPage.logInCheckboxPage();
        checkboxesPage.verifyCheckBoxes();
    }
/*
Test right clicks on the context menu.
Test asserts the alert menu text.
 */
    @Test
    public void ContextMenu() {
        contextMenuPage.getConnection("ContextMenu");
        contextMenuPage.clickOnWindow();
        contextMenuPage.getText();
    }
/*
Test drags element A to element B.
Test asserts that the text on element A and B are switched.
 */
    @Test
    public void DragAndDrop() {
        dragAndDropPage.getConnection("DragAndDrop");
        dragAndDropPage.dragAndDrop();
        Assert.assertTrue(dragAndDropPage.elementsLocationsDifference() > 0);

    }
/*
Test selects Option 1 and Option 2 from the drop down menu.
Test asserts Option 1 and Option 2 are selected.
 */
    @Test
    public void Dropdown() {
        dropdownPage.getConnection("Dropdown");
        dropdownPage.setSelectOptions();
    }
/*
Test refreshes the page a couple of times.
Test asserts that the content changes on each refresh.
 */
    @Test
    public void DynamicContent() {
        dynamicContentPage.getConnection("DynamicContent");
        List<String> firstListOfMessages = dynamicContentPage.getMessagesText();
        BrowserUtils.refreshPage();
        List<String> secondListOfMessages = dynamicContentPage.getMessagesText();
        Assert.assertNotEquals(firstListOfMessages, secondListOfMessages);

    }
/*
Test clicks on the Remove Button and uses explicit wait.
Test asserts that the checkbox is gone.
Test clicks on Add Button and uses explicit wait.
Test asserts that the checkbox is present.
Test clicks on the Enable Button and uses explicit wait.
Test asserts that the text box is enabled.
Test clicks on the Disable Button and uses explicit wait.
Test asserts that the text box is disabled.
 */
    @Test
    public void DynamicControls() {
        dynamicControlsPages.getConnection("DynamicControls");
        dynamicControlsPages.checkBoxChecking();
        dynamicControlsPages.checkEnabledButton();

    }
/*
Test clicks the start button and uses explicit wait.
Test asserts that “Hello World!” text is displayed.
 */
    @Test
    public void DynamicLoading() {
        dynamicLoadingPage.getConnection("DynamicLoading");
        dynamicLoadingPage.checkLoadingFunctionality();

    }
/*
Test clicks on the file.
Test asserts that the file is downloaded.
 */
    @Test
    public void FileDownload() throws IOException {
        fileDownloadPage.getConnection("FileDownload");
        fileDownloadPage.downloadFile();
        int fileName = BrowserUtils.getFileName("some-file.txt");
        Assert.assertEquals(1, fileName);

    }
/*
Test uses Upload Button or Drag and Drop to upload a file.
Test asserts that the file is uploaded.
 */
    @Test
    public void FileUpload() {
        fileUploadPage.getConnection("FileUpload");
        fileUploadPage.uploadFile();

    }
/*
Test scrolls the page.
Test asserts that the floating menu is still displayed.
 */
    @Test
    public void FloatingMenu() {
        floatingMenuPage.getConnection("FloatingMenu");
        floatingMenuPage.scrollAndCheck();

    }
/*
Test switches to Iframe and types some text.
Test asserts that the typed text is as expected.
 */
    @Test
    public void Iframe(){
        iframePage.getConnection("Iframe");
        iframePage.checkFrame();
    }
/*
Test does a mouse hover on each image.
Test asserts that additional information is displayed for each image.
 */
    @Test
    public void MouseHover(){
        mouseHoverPage.getConnection("MouseHover");
        mouseHoverPage.hoverOver();

    }
/*
Test Clicks on JS Alert Button.
Test asserts alert message.
Test clicks on JS confirm Button and clicks ok on alert.
Test asserts the alert message.
Test clicks on JS Prompt Button and types a message on Prompt.
Test asserts that the alert message contains the typed message.
 */
    @Test
    public void JavaScriptAlerts(){
        javaScriptAlertsPage.getConnection("JavaScriptAlerts");
        javaScriptAlertsPage.clickAlert();
        javaScriptAlertsPage.clickToConfirm();
        javaScriptAlertsPage.clickPrompt();

    }
/*
Test finds the JavaScript error on the page.
Test asserts that the page contains error: Cannot read property 'xyz' of undefined.
 */
    @Test
    public void JavaScriptError(){
        javaScriptErrorPage.getConnection("JavaScriptError");

    }
/*
Test clicks on the Click Here link.
Test asserts that a new tab is opened with text New Window.
 */
    @Test
    public void OpenInNewTab(){
        openInNewTabPage.getConnection("OpenInNewTab");
        openInNewTabPage.checkNewWindow();

    }
/*
Test clicks on the Click Here link a multiple times.
Test asserts that one of the “Action Successful”, “Action unsuccessful, please try again” and “Action Unsuccessful”
messages show on click.
 */
    @Test
    public void NotificationMessage(){
        notificationMessagePage.getConnection("NotificationMessage");
        notificationMessagePage.click();

    }
}