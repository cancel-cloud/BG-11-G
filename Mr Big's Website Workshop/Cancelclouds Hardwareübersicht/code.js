const componentData = [
    {
        title: 'CPU',
        img: 'https://images.unsplash.com/photo-1591799264318-7e6ef8ddb7ea?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80',
        short: "Central Processing Unit",
        long: "The CPU is used for processing data. It's the heart of the computer.",
        url: "https://www.youtube.com/watch?v=vqs_0W-MSB0"
    },
    {
        title: 'GPU',
        img: 'https://images.unsplash.com/photo-1591488320449-011701bb6704?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
        short: "Graphics Processing Unit",
        long: "The GPU is used for processing graphics and images. It computes the images displayed on screen.",
        url: "https://www.youtube.com/watch?v=SrAMBi_8tIk"
    },
    {
        title: 'RAM',
        img: 'https://images.unsplash.com/photo-1542978709-19c95dc3bc7e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80',
        short: "Random Access Memory",
        long: "The RAM is used for storing data in a place, which is fastly accessible. It is the short-term memory of the computer.",
        url: "https://www.youtube.com/watch?v=6pp_krChw_A"
    },
    {
        title: 'Motherboard',
        img: 'https://images.unsplash.com/photo-1631031509251-62a73758f9d3?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8bW90aGVyYm9hcmR8ZW58MHx8MHx8&auto=format&fit=crop&w=900&q=60',
        short: "Mainboard",
        long: "The motherboard is used for connecting all the components of the computer. It is the bones of the computer.",
        url: "https://www.youtube.com/watch?v=zxGqGCtPxn4"
    },
    {
        title: 'Power Supply',
        img: 'https://images.unsplash.com/photo-1675893857450-783969c8922f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y29tcHV0ZXIlMjBwb3dlciUyMHN1cHBseXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
        short: "Power Supply Unit",
        long: "The power supply is used for providing power to the computer.",
        url: "https://www.youtube.com/watch?v=i9ZnaA8DZDs"
    },
    {
        title: 'SSD',
        img: 'https://images.unsplash.com/photo-1661347561635-58eff5e23f3b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fFNTRHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
        short: "Solid State Drive",
        long: "The SSD is used for storing large amount of data.",
        url: "https://youtu.be/5Mh3o886qpg"
    },
    {
        title: 'Case',
        img: 'https://images.unsplash.com/photo-1593152167544-085d3b9c4938?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fGNvbXB1dGVyJTIwY2FzZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
        short: "Computer Case",
        long: "The case is used for housing all the components of the computer.",
        url: "https://www.youtube.com/watch?v=Ps6qAjjM3bU"
    },
    {
        title: 'Keyboard',
        img: 'https://images.unsplash.com/photo-1618384887929-16ec33fab9ef?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGtleWJvYXJkfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=900&q=60',
        short: "Computer Keyboard",
        long: "The keyboard is used by a human to interact with the computer.",
        url: "https://www.youtube.com/watch?v=ewE8b7zzej0"
    },
    {
        title: 'Mouse',
        img: 'https://images.unsplash.com/photo-1599581142115-e8ca8db95d38?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGNvbXB1dGVyJTIwbW91c2V8ZW58MHx8MHx8&auto=format&fit=crop&w=900&q=60',
        short: "Computer Mouse",
        long: "The mouse is used by a human to interact with the computer.",
        url: "https://www.youtube.com/watch?v=WsQV1boFCLk"
    },
    {
        title: 'Monitor',
        img: 'https://images.unsplash.com/photo-1548524238-a971a4a3b523?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDB8fGNvbXB1dGVyJTIwbW9uaXRvcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
        short: "Computer Monitor",
        long: "The monitor is used for displaying images produced by the graphics card.",
        url: "https://www.youtube.com/watch?v=uyLDA9QT8EY"
    }
];

componentData.forEach(item => {
    let components = document.getElementById('components');
    const component = document.createElement('div');
    component.classList.add('component');
    component.innerHTML = `
    <figure class="snip1433">
        <figcaption>
            <h2 class="">${item.title}</h2>
            <p>${item.long}</p>
            <a class="youtubelink" href=${item.url} target="_blank">Learn More</a>
        </figcaption>
        <img class="backgroundImage" src=${item.img} alt="sample70" />
    </figure>
    `;
    components.appendChild(component);
});
