"use client";
import Image from "next/image";
import { ThemeProvider, Button } from "@material-tailwind/react";
export { ThemeProvider, Button };


export default function Home() {
    return (
        <main className="flex min-h-screen flex-col items-center justify-center px-4 sm:p-24">
            <div>
                <h1 className="text-3xl sm:text-5xl font-bold text-center mb-4 bg-clip-text 
                text-transparent bg-gradient-to-r from-blue-500 to-pink-400">Hardware Overview</h1>
                <p className="text-center text-gray-500 mb-8 sm:mb-12">Here you can find an overview of the most
                    important hardware components of a computer.</p>
                <ul role="list"
                    className="grid grid-cols-1 gap-x-4 gap-y-8 sm:grid-cols-2 sm:gap-x-6 lg:grid-cols-3 xl:grid-cols-4 xl:gap-x-8">
                    {files.map((file) => (
                        <li key={file.source}
                            className="relative border border-white border-opacity-50 rounded-md shadow-sm">
                            <div
                                className="group aspect-w-10 aspect-h-7 block w-full h-48 overflow-hidden rounded-lg bg-gray-100 focus-within:ring-2 focus-within:ring-indigo-500 focus-within:ring-offset-2 focus-within:ring-offset-gray-100">
                                <img src={file.source} alt=""
                                     className="pointer-events-none object-cover group-hover:opacity-75 h-full w-full"/>
                                <button type="button" className="absolute inset-0 focus:outline-none">
                                    <span className="sr-only">View details for {file.title}</span>
                                </button>
                            </div>
                            <p className="pointer-events-none mt-2 block truncate text-sm font-medium text-blue-800 text-center">{file.title}</p>
                            <p className="pointer-events-none block text-sm font-medium text-gray-500 text-center">{file.description}</p>
                        </li>
                    ))}
                </ul>
            </div>
        </main>
    );
}


const files = [
    {
        title: 'Central Processing Unit',
        description: 'CPU',
        source: 'https://images.unsplash.com/photo-1591799264318-7e6ef8ddb7ea?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80',
    },
    {
        title: 'Graphics Processing Unit',
        description: 'GPU',
        source: 'https://images.unsplash.com/photo-1591488320449-011701bb6704?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
    },
    {
        title: 'Random Access Memory',
        description: 'RAM',
        source: 'https://images.unsplash.com/photo-1542978709-19c95dc3bc7e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80',
    },
    {
        title: 'Power Supply Unit',
        description: 'Power Supply',
        source: 'https://images.unsplash.com/photo-1675893857450-783969c8922f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8Y29tcHV0ZXIlMjBwb3dlciUyMHN1cHBseXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
    },
    {
        title: 'Solid State Drive',
        description: 'SSD',
        source: 'https://images.unsplash.com/photo-1661347561635-58eff5e23f3b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fFNTRHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
    },
    {
        title: 'Case',
        description: 'Computer Case',
        source: 'https://images.unsplash.com/photo-1593152167544-085d3b9c4938?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fGNvbXB1dGVyJTIwY2FzZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
    },
    {
        title: 'Keyboard',
        description: 'Computer Keyboard',
        source: 'https://images.unsplash.com/photo-1618384887929-16ec33fab9ef?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGtleWJvYXJkfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=900&q=60',
    },
    {
        title: 'Mouse',
        description: 'Computer Mouse',
        source: 'https://images.unsplash.com/photo-1599581142115-e8ca8db95d38?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGNvbXB1dGVyJTIwbW91c2V8ZW58MHx8MHx8&auto=format&fit=crop&w=900&q=60',
    },
    {
        title: 'Monitor',
        description: 'Computer Monitor',
        source: 'https://images.unsplash.com/photo-1548524238-a971a4a3b523?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDB8fGNvbXB1dGVyJTIwbW9uaXRvcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=900&q=60',
    },
]