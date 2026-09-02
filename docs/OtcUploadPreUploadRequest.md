
# OtcUploadPreUploadRequest

File pre-upload request body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | **Base64** of the file MIME type, required. Only image/png, image/jpeg, image/jpg, and application/pdf are supported. | 
**scene** | [**SceneEnum**](#SceneEnum) | Business scene, optional, defaults to general; determines temporary path and production directory after relocation |  [optional]

## Enum: ContentTypeEnum

Name | Value
---- | -----
AW1HZ2UVCG5N | &quot;aW1hZ2UvcG5n&quot;
AW1HZ2UVANBLZW_ | &quot;aW1hZ2UvanBlZw&#x3D;&#x3D;&quot;
AW1HZ2UVANBN | &quot;aW1hZ2UvanBn&quot;
YXBWBGLJYXRPB24VCGRM | &quot;YXBwbGljYXRpb24vcGRm&quot;

## Enum: SceneEnum

Name | Value
---- | -----
GENERAL | &quot;general&quot;
BANK | &quot;bank&quot;
ASSESSMENT | &quot;assessment&quot;
CREDIT | &quot;credit&quot;

