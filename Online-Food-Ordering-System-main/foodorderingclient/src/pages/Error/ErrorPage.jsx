import React from 'react';
import { useRouteError } from 'react-router-dom';

export default function ErrorPage() {
    const error = useRouteError();

    return (
        <div style={{ padding: '2rem' }}>
            <h1>Oops! 😓</h1>
            <p>Something went wrong or the page was not found.</p>
            <pre>{error.statusText || error.message}</pre>
        </div>
    );
}
