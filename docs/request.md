Exercise: Music Streaming System with Singleton, Abstract Factory, Observer, and MySQL Persistence 🎵🎶

A music streaming platform requires an optimized and persistent playback system that allows users to manage playlists and receive real-time notifications about changes.
System Requirements

🔹 Single Instance Music Player with Singleton

The system must ensure that only one instance of the music player is running at a time. This player should be responsible for:

    Playing, pausing, and stopping songs.
    Controlling volume.
    Managing the playback queue (adding or removing songs).

🔹 Flexible Playlist Creation with Abstract Factory

Users should be able to create customized playlists based on different music genres, for example:

    Collaborative Playlist: Managed by an administrator; subscribed users with permissions can add songs to the playlist.
    Private Playlist: Only the administrator can manage the content.

Each playlist type must apply specific rules for modifying information and notifying subscribed users.

🔹 Real-Time Notifications with Observer

The system should notify users when key events occur, such as:

    A new song is added to a playlist.
    A playlist is deleted.
    A playlist is renamed.

Users must subscribe to a playlist to receive real-time notifications.

🔹 Playlist Persistence in Files or Databases

Playlists should be stored in a database or files using the Repository pattern to structure the persistent entities (Users, Playlists, Songs).

    Store playlists with their names and genres.
    Save songs within each playlist.
    Persist user accounts.
    Enable playlist retrieval from the database in future sessions.

Implementation Scenario

A music streaming platform aims to enhance user experience with a structured and real-time playback system.

✅ Ensure that only one music player instance is active at any given time.

✅ Allow users to create personalized playlists based on music genres.

✅ Notify users about changes to their playlists using the Observer pattern.

Your task is to design and implement this system, ensuring that Singleton, Abstract Factory, and Observer work together to deliver a smooth and scalable experience. 🚀